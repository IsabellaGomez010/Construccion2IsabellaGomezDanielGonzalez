package app.domain.repository;

import app.domain.model.MedicalRecord;

public interface MedicalRecordPort {
	void saveMedicalRecord(MedicalRecord medicalRecord);
	MedicalRecord getMedicalRecordByPatientId(String patientIdNumber);
}
