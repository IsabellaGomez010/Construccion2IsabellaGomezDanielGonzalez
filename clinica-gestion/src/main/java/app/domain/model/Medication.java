package app.domain.model;


public class Medication {
	private String medicationId;
	private String name;
	private double cost;

	public Medication(String medicationId, String name, double cost) {
		this.medicationId = medicationId;
		this.name = name;
		this.cost = cost;
	}

	public String getMedicationId() { return medicationId; }
	public String getName() { return name; }
	public double getCost() { return cost; }
}
