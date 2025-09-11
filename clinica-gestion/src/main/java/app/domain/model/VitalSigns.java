package app.domain.model;

public class VitalSigns {
	private String bloodPressure;
	private double temperature;
	private int pulse;
	private int oxygenLevel;

	public VitalSigns(String bloodPressure, double temperature, int pulse, int oxygenLevel) {
		this.bloodPressure = bloodPressure;
		this.temperature = temperature;
		this.pulse = pulse;
		this.oxygenLevel = oxygenLevel;
	}

	public String getBloodPressure() { return bloodPressure; }
	public double getTemperature() { return temperature; }
	public int getPulse() { return pulse; }
	public int getOxygenLevel() { return oxygenLevel; }

    public void setBloodPressure(String bloodPressure) { this.bloodPressure = bloodPressure; }
    public void setTemperature(double temperature) { this.temperature = temperature; }
    public void setPulse(int pulse) { this.pulse = pulse; }
    public void setOxygenLevel(int oxygenLevel) { this.oxygenLevel = oxygenLevel; }
}
