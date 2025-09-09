package app.application.usecase;

import app.application.port.in.PatientManagementUseCase;
import app.domain.model.Patient;
import app.domain.repository.PatientRepository;

public class PatientManagementService implements PatientManagementUseCase {
	private final PatientRepository patientRepository;

	public PatientManagementService(PatientRepository patientRepository) {
		this.patientRepository = patientRepository;
	}

	@Override
	public void registerPatient(Patient patient) {
		patientRepository.save(patient);
	}

	@Override
	public Patient getPatientById(String idNumber) {
		return patientRepository.findByIdNumber(idNumber);
	}
}
