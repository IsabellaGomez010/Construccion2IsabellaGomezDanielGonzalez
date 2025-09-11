package app.domain.model;


public class EmergencyContact {
	private String fullName;
	private String relationship;
	private String phoneNumber;

	public EmergencyContact(String fullName, String relationship, String phoneNumber) {
		this.fullName = fullName;
		this.relationship = relationship;
		this.phoneNumber = phoneNumber;
	}

	public String getFullName() { return fullName; }
	public String getRelationship() { return relationship; }
	public String getPhoneNumber() { return phoneNumber; }

    public void setFullName(String fullName) { this.fullName = fullName; }
    public void setRelationship(String relationship) { this.relationship = relationship; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    private boolean isValidPhoneNumber() {
		return phoneNumber != null && phoneNumber.matches("\\d{10}");
	}
}
