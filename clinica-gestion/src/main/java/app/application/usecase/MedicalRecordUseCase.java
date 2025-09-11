package app.application.usecase;

import app.domain.model.MedicalRecord;
import app.domain.repository.MedicalRecordPort;

public class MedicalRecordUseCase implements MedicalRecordPort {
	private final MedicalRecordPort medicalRecordPort;

	public MedicalRecordUseCase(MedicalRecordPort medicalRecordPort) {
		this.medicalRecordPort = medicalRecordPort;
	}

	@Override
	public void saveMedicalRecord(MedicalRecord medicalRecord) {
		if (medicalRecord.getPatientIdNumber() == null || medicalRecord.getPatientIdNumber().isEmpty()) {
			throw new IllegalArgumentException("La cédula del paciente es obligatoria");
		}

		for (String date : medicalRecord.getEntries().keySet()) {
			if (!date.matches("\\d{2}/\\d{2}/\\d{4}")) {
				throw new IllegalArgumentException("Fecha de atención inválida");
			}

			app.domain.model.MedicalRecordEntry entry = medicalRecord.getEntries().get(date);
			
			if (entry.getDiagnosis() == null && (entry.getMedications().size() > 0 || entry.getProcedures().size() > 0)) {
				throw new IllegalArgumentException("No se pueden recetar medicamentos o procedimientos sin diagnóstico");
			}
			
			if (entry.getDiagnosticAids().size() > 0 && (entry.getMedications().size() > 0 || entry.getProcedures().size() > 0)) {
				throw new IllegalArgumentException("No se pueden recetar medicamentos ni procedimientos junto con ayuda diagnóstica en la misma atención");
			}
		}
		medicalRecordPort.saveMedicalRecord(medicalRecord);
	}

	@Override
	public MedicalRecord getMedicalRecordByPatientId(String patientIdNumber) {
		return medicalRecordPort.getMedicalRecordByPatientId(patientIdNumber);
	}
}
