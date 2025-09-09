package app.domain.repository;

import app.domain.model.Medication;
import app.domain.model.Procedure;
import app.domain.model.DiagnosticAid;


public interface InventoryRepository {
	void saveMedication(Medication medication);
	void saveProcedure(Procedure procedure);
	void saveDiagnosticAid(DiagnosticAid diagnosticAid);
	Medication findMedicationById(String medicationId);
	Procedure findProcedureById(String procedureId);
	DiagnosticAid findDiagnosticAidById(String diagnosticAidId);
}
