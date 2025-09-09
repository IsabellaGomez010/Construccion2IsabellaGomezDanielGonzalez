package app.application.port.in;

import app.domain.model.Patient;

public interface PatientManagementUseCase {
	void registerPatient(Patient patient);
	Patient getPatientById(String idNumber);
}
