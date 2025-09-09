package app.domain.model;


public class Procedure {
	private String procedureId;
	private String name;
	private double cost;

	public Procedure(String procedureId, String name, double cost) {
		this.procedureId = procedureId;
		this.name = name;
		this.cost = cost;
	}

	public String getProcedureId() { return procedureId; }
	public String getName() { return name; }
	public double getCost() { return cost; }
}
