package app.application.port.in;

import app.domain.model.MedicalRecord;

public interface MedicalRecordUseCase {
	void saveMedicalRecord(MedicalRecord medicalRecord);
	MedicalRecord getMedicalRecordByPatientId(String patientIdNumber);
}
