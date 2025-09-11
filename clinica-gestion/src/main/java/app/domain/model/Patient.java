package app.domain.model;

import app.domain.model.enums.Gender;

public class Patient {
	private String idNumber;
	private String fullName;
	private String birthDate;
	private Gender gender;
	private String address;
	private String phoneNumber;
	private String email;
	private EmergencyContact emergencyContact;
	private Insurance insurance;

	public Patient(String idNumber, String fullName, String birthDate, Gender gender, String address, String phoneNumber, String email, EmergencyContact emergencyContact, Insurance insurance) {
		this.idNumber = idNumber;
		this.fullName = fullName;
		this.birthDate = birthDate;
		this.gender = gender;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.emergencyContact = emergencyContact;
		this.insurance = insurance;
	}

	public String getIdNumber() { return idNumber; }
	public String getFullName() { return fullName; }
	public String getBirthDate() { return birthDate; }
	public Gender getGender() { return gender; }
	public String getAddress() { return address; }
	public String getPhoneNumber() { return phoneNumber; }
	public String getEmail() { return email; }
	public EmergencyContact getEmergencyContact() { return emergencyContact; }
	public Insurance getInsurance() { return insurance; }

    public void setIdNumber(String idNumber) { this.idNumber = idNumber; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public void setBirthDate(String birthDate) { this.birthDate = birthDate; }
    public void setGender(Gender gender) { this.gender = gender; }
    public void setAddress(String address) { this.address = address; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public void setEmail(String email) { this.email = email; }
    public void setEmergencyContact(EmergencyContact emergencyContact) { this.emergencyContact = emergencyContact; }
    public void setInsurance(Insurance insurance) { this.insurance = insurance; }

    private boolean isValidPhoneNumber() {
		return phoneNumber != null && phoneNumber.matches("\\d{10}");
	}

	private boolean isValidBirthDate() {
		return birthDate != null && birthDate.matches("\\d{2}/\\d{2}/\\d{4}");
	}
}
