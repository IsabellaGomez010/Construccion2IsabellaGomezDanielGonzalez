package app.domain.model;

import java.util.Map;

public class MedicalRecord {
	private String patientIdNumber;
	private Map<String, MedicalRecordEntry> entries;

	public MedicalRecord(String patientIdNumber, Map<String, MedicalRecordEntry> entries) {
		this.patientIdNumber = patientIdNumber;
		this.entries = entries;
	}

	public String getPatientIdNumber() {
		return patientIdNumber;
	}
    public Map<String, MedicalRecordEntry> getEntries() {
		return entries;
	}

    public void setPatientIdNumber(String patientIdNumber) { this.patientIdNumber = patientIdNumber;}
    public void setEntries(Map<String, MedicalRecordEntry> entries) {this.entries = entries; }
}
