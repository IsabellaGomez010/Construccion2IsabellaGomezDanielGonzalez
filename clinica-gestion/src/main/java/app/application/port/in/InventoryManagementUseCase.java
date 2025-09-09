package app.application.port.in;

import app.domain.model.Medication;
import app.domain.model.Procedure;
import app.domain.model.DiagnosticAid;

public interface InventoryManagementUseCase {
	void addMedication(Medication medication);
	void addProcedure(Procedure procedure);
	void addDiagnosticAid(DiagnosticAid diagnosticAid);
	Medication getMedicationById(String medicationId);
	Procedure getProcedureById(String procedureId);
	DiagnosticAid getDiagnosticAidById(String diagnosticAidId);
}
