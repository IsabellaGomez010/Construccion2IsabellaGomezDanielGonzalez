package app.application.usecase;

import app.domain.model.Patient;
import app.domain.repository.PatientManagementPort;

public class PatientManagementUseCase implements PatientManagementPort {
	private final PatientManagementPort patientManagementPort;

	public PatientManagementUseCase(PatientManagementPort patientManagementPort) {
		this.patientManagementPort = patientManagementPort;
	}

	@Override
	public void registerPatient(Patient patient) {
		if (patientManagementPort.getPatientById(patient.getIdNumber()) != null) {
			throw new IllegalArgumentException("La cédula del paciente ya existe");
		}

		if (!patient.getPhoneNumber().matches("\\d{10}")) {
			throw new IllegalArgumentException("Teléfono inválido");
		}

		if (!patient.getBirthDate().matches("\\d{2}/\\d{2}/\\d{4}")) {
			throw new IllegalArgumentException("Fecha de nacimiento inválida");
		}

		if (patient.getEmergencyContact() == null) {
			throw new IllegalArgumentException("Debe tener un contacto de emergencia");
		}

		if (patient.getInsurance() == null) {
			throw new IllegalArgumentException("Debe tener una póliza de seguro");
		}

		if (!patient.getEmergencyContact().getPhoneNumber().matches("\\d{10}")) {
			throw new IllegalArgumentException("Teléfono de emergencia inválido");
		}
		patientManagementPort.registerPatient(patient);
	}

	@Override
	public Patient getPatientById(String idNumber) {
		return patientManagementPort.getPatientById(idNumber);
	}
}
