package app.domain.model;


public class OrderItem {
	private int itemNumber;
	private String type; 
	private String name;
	private double cost;

	// Medication 
	private String dose;
	private String treatmentDuration;

	// Procedure 
	private int repeatCount;
	private String frequency;
	private boolean requiresSpecialist;
	private String specialistTypeId;

	// Diagnostic specific
	private int quantity;

	public OrderItem(int itemNumber, String type, String name, double cost, String dose, String treatmentDuration, int repeatCount, String frequency, boolean requiresSpecialist, String specialistTypeId, int quantity) {
		this.itemNumber = itemNumber;
		this.type = type;
		this.name = name;
		this.cost = cost;
		this.dose = dose;
		this.treatmentDuration = treatmentDuration;
		this.repeatCount = repeatCount;
		this.frequency = frequency;
		this.requiresSpecialist = requiresSpecialist;
		this.specialistTypeId = specialistTypeId;
		this.quantity = quantity;
	}

	public int getItemNumber() { return itemNumber; }
	public String getType() { return type; }
	public String getName() { return name; }
	public double getCost() { return cost; }
	public String getDose() { return dose; }
	public String getTreatmentDuration() { return treatmentDuration; }
	public int getRepeatCount() { return repeatCount; }
	public String getFrequency() { return frequency; }
	public boolean isRequiresSpecialist() { return requiresSpecialist; }
	public String getSpecialistTypeId() { return specialistTypeId; }
	public int getQuantity() { return quantity; }
}
