package app.application.usecase;

import app.domain.model.Medication;
import app.domain.model.Procedure;
import app.domain.model.DiagnosticAid;
import app.domain.repository.InventoryManagementPort;

public class InventoryManagementUseCase implements InventoryManagementPort {
	private final InventoryManagementPort inventoryManagementPort;

	public InventoryManagementUseCase(InventoryManagementPort inventoryManagementPort) {
		this.inventoryManagementPort = inventoryManagementPort;
	}

	@Override
	public void addMedication(Medication medication) {
		if (inventoryManagementPort.getMedicationById(medication.getMedicationId()) != null) {
			throw new IllegalArgumentException("El medicamento ya existe en el inventario");
		}
		inventoryManagementPort.addMedication(medication);
	}

	@Override
	public void addProcedure(Procedure procedure) {
		if (inventoryManagementPort.getProcedureById(procedure.getProcedureId()) != null) {
			throw new IllegalArgumentException("El procedimiento ya existe en el inventario");
		}
		inventoryManagementPort.addProcedure(procedure);
	}

	@Override
	public void addDiagnosticAid(DiagnosticAid diagnosticAid) {
		if (inventoryManagementPort.getDiagnosticAidById(diagnosticAid.getDiagnosticAidId()) != null) {
			throw new IllegalArgumentException("La ayuda diagnóstica ya existe en el inventario");
		}
		inventoryManagementPort.addDiagnosticAid(diagnosticAid);
	}

	@Override
	public Medication getMedicationById(String medicationId) {
		return inventoryManagementPort.getMedicationById(medicationId);
	}

	@Override
	public Procedure getProcedureById(String procedureId) {
		return inventoryManagementPort.getProcedureById(procedureId);
	}

	@Override
	public DiagnosticAid getDiagnosticAidById(String diagnosticAidId) {
		return inventoryManagementPort.getDiagnosticAidById(diagnosticAidId);
	}
}
