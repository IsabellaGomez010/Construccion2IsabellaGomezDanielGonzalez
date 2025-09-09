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

	private boolean isValidPhoneNumber() {
		return phoneNumber != null && phoneNumber.matches("\\d{10}");
	}
}
