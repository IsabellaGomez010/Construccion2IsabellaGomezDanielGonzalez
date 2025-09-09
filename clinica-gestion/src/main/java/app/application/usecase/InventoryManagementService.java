package app.application.usecase;

import app.application.port.in.InventoryManagementUseCase;
import app.domain.model.Medication;
import app.domain.model.Procedure;
import app.domain.model.DiagnosticAid;
import app.domain.repository.InventoryRepository;

public class InventoryManagementService implements InventoryManagementUseCase {
	private final InventoryRepository inventoryRepository;

	public InventoryManagementService(InventoryRepository inventoryRepository) {
		this.inventoryRepository = inventoryRepository;
	}

	@Override
	public void addMedication(Medication medication) {
		inventoryRepository.saveMedication(medication);
	}

	@Override
	public void addProcedure(Procedure procedure) {
		inventoryRepository.saveProcedure(procedure);
	}

	@Override
	public void addDiagnosticAid(DiagnosticAid diagnosticAid) {
		inventoryRepository.saveDiagnosticAid(diagnosticAid);
	}

	@Override
	public Medication getMedicationById(String medicationId) {
		return inventoryRepository.findMedicationById(medicationId);
	}

	@Override
	public Procedure getProcedureById(String procedureId) {
		return inventoryRepository.findProcedureById(procedureId);
	}

	@Override
	public DiagnosticAid getDiagnosticAidById(String diagnosticAidId) {
		return inventoryRepository.findDiagnosticAidById(diagnosticAidId);
	}
}
