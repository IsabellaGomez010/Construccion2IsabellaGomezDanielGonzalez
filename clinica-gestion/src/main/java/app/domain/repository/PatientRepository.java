package app.domain.port;

import app.domain.model.Patient;


public interface PatientRepository {
	void save(Patient patient);
	Patient findByIdNumber(String idNumber);
	boolean existsByIdNumber(String idNumber);
}
