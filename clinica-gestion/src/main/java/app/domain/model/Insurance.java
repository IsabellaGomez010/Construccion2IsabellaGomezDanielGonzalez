package app.domain.model;


public class Insurance {
	private String companyName;
	private String policyNumber;
	private boolean isActive;
	private String expirationDate;

	public Insurance(String companyName, String policyNumber, boolean isActive, String expirationDate) {
		this.companyName = companyName;
		this.policyNumber = policyNumber;
		this.isActive = isActive;
		this.expirationDate = expirationDate;
	}

	public String getCompanyName() { return companyName; }
	public String getPolicyNumber() { return policyNumber; }
	public boolean isActive() { return isActive; }
	public String getExpirationDate() { return expirationDate; }

	private boolean isValidExpirationDate() {
		return expirationDate != null && expirationDate.matches("\\d{2}/\\d{2}/\\d{4}");
	}
}
