package app.domain.repository;

import app.domain.model.Patient;

public interface PatientManagementPort {
	void registerPatient(Patient patient);
	Patient getPatientById(String idNumber);
}
