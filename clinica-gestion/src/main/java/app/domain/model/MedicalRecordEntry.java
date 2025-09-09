package app.domain.model;

import java.util.List;

public class MedicalRecordEntry {
	private String date;
	private String doctorIdNumber;
	private String consultationReason;
	private String symptoms;
	private String diagnosis;
	private List<Order> orders;

	public MedicalRecordEntry(String date, String doctorIdNumber, String consultationReason, String symptoms, String diagnosis, List<Order> orders) {
		this.date = date;
		this.doctorIdNumber = doctorIdNumber;
		this.consultationReason = consultationReason;
		this.symptoms = symptoms;
		this.diagnosis = diagnosis;
		this.orders = orders;
	}

	public String getDate() { return date; }
	public String getDoctorIdNumber() { return doctorIdNumber; }
	public String getConsultationReason() { return consultationReason; }
	public String getSymptoms() { return symptoms; }
	public String getDiagnosis() { return diagnosis; }
	public List<Order> getOrders() { return orders; }
}
