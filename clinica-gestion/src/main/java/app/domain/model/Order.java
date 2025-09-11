package app.domain.model;

import java.util.List;

public class Order {
	private String orderNumber;
	private String patientIdNumber;
	private String doctorIdNumber;
	private String creationDate;
	private List<OrderItem> items;

	public Order(String orderNumber, String patientIdNumber, String doctorIdNumber, String creationDate, List<OrderItem> items) {
		this.orderNumber = orderNumber;
		this.patientIdNumber = patientIdNumber;
		this.doctorIdNumber = doctorIdNumber;
		this.creationDate = creationDate;
		this.items = items;
	}

	public String getOrderNumber() { return orderNumber; }
	public String getPatientIdNumber() { return patientIdNumber; }
	public String getDoctorIdNumber() { return doctorIdNumber; }
	public String getCreationDate() { return creationDate; }
	public List<OrderItem> getItems() { return items; }

    public void setOrderNumber(String orderNumber) { this.orderNumber = orderNumber; }
    public void setPatientIdNumber(String patientIdNumber) { this.patientIdNumber = patientIdNumber; }
    public void setDoctorIdNumber(String doctorIdNumber) { this.doctorIdNumber = doctorIdNumber; }
    public void setCreationDate(String creationDate) { this.creationDate = creationDate; }
    public void setItems(List<OrderItem> items) { this.items = items; }

    private boolean isValidOrderNumber() {
		return orderNumber != null && orderNumber.matches("\\d{1,6}");
	}
}
