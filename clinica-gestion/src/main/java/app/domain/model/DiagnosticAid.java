package app.domain.model;


public class DiagnosticAid {
	private String diagnosticAidId;
	private String name;
	private double cost;

	public DiagnosticAid(String diagnosticAidId, String name, double cost) {
		this.diagnosticAidId = diagnosticAidId;
		this.name = name;
		this.cost = cost;
	}

	public String getDiagnosticAidId() { return diagnosticAidId; }
	public String getName() { return name; }
	public double getCost() { return cost; }

    public void setDiagnosticAidId(String diagnosticAidId) { this.diagnosticAidId = diagnosticAidId; }
    public void setName(String name) { this.name = name; }
    public void setCost(double cost) { this.cost = cost; }
}
