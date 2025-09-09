package app.domain.repository;

import app.domain.model.MedicalRecord;


public interface MedicalRecordRepository {
	void save(MedicalRecord medicalRecord);
	MedicalRecord findByPatientIdNumber(String patientIdNumber);
	boolean existsByPatientIdNumber(String patientIdNumber);
}
