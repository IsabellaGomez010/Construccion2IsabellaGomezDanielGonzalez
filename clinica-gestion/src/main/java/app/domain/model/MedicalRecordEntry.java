package app.domain.model;

import java.util.List;

public class MedicalRecordEntry {
    private String date;
    private String doctorIdNumber;
    private String consultationReason;
    private String symptoms;
    private String diagnosis;
    private List<Order> orders;

	public List<OrderItem> getMedications() {
		return orders == null ? java.util.Collections.emptyList() : orders.stream()
			.flatMap(order -> order.getItems().stream())
			.filter(item -> "MEDICATION".equalsIgnoreCase(item.getType()))
			.collect(java.util.stream.Collectors.toList());
	}

	public List<OrderItem> getProcedures() {
		return orders == null ? java.util.Collections.emptyList() : orders.stream()
			.flatMap(order -> order.getItems().stream())
			.filter(item -> "PROCEDURE".equalsIgnoreCase(item.getType()))
			.collect(java.util.stream.Collectors.toList());
	}

	public List<OrderItem> getDiagnosticAids() {
		return orders == null ? java.util.Collections.emptyList() : orders.stream()
			.flatMap(order -> order.getItems().stream())
			.filter(item -> "DIAGNOSTIC_AID".equalsIgnoreCase(item.getType()))
			.collect(java.util.stream.Collectors.toList());
	}

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

    public void setDate(String date) { this.date = date; }
    public void setDoctorIdNumber(String doctorIdNumber) { this.doctorIdNumber = doctorIdNumber; }
    public void setConsultationReason(String consultationReason) { this.consultationReason = consultationReason; }
    public void setSymptoms(String symptoms) { this.symptoms = symptoms; }
    public void setDiagnosis(String diagnosis) { this.diagnosis = diagnosis;}
    public void setOrders(List<Order> orders) { this.orders = orders; }
}
