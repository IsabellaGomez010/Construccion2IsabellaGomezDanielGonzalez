package app.application.usecase;

import app.application.port.in.MedicalRecordUseCase;
import app.domain.model.MedicalRecord;
import app.domain.repository.MedicalRecordRepository;

public class MedicalRecordService implements MedicalRecordUseCase {
	private final MedicalRecordRepository medicalRecordRepository;

	public MedicalRecordService(MedicalRecordRepository medicalRecordRepository) {
		this.medicalRecordRepository = medicalRecordRepository;
	}

	@Override
	public void saveMedicalRecord(MedicalRecord medicalRecord) {
		medicalRecordRepository.save(medicalRecord);
	}

	@Override
	public MedicalRecord getMedicalRecordByPatientId(String patientIdNumber) {
		return medicalRecordRepository.findByPatientIdNumber(patientIdNumber);
	}
}
