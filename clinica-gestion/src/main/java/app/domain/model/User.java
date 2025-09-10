package app.domain.model;

import app.domain.model.enums.UserRole;

public class User {
	private String fullName;
	private String idNumber;
	private String email;
	private String phoneNumber;
	private String birthDate;
	private String address;
	private UserRole role;
	private String username;
	private String password;

	public User(String fullName, String idNumber, String email, String phoneNumber, String birthDate, String address, UserRole role, String username, String password) {
		this.fullName = fullName;
		this.idNumber = idNumber;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.birthDate = birthDate;
		this.address = address;
		this.role = role;
		this.username = username;
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public String getEmail() {
		return email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public String getAddress() {
		return address;
	}

	public UserRole getRole() {
		return role;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	private boolean isValidEmail() {
		return email != null && email.contains("@") && email.length() <= 50;
	}

	private boolean isValidIdNumber() {
		return idNumber != null && idNumber.matches("\\d+");
	}

	private boolean isValidPhoneNumber() {
		return phoneNumber != null && phoneNumber.matches("\\d{1,10}");
	}

	private boolean isValidBirthDate() {
		return birthDate != null && birthDate.matches("\\d{2}/\\d{2}/\\d{4}");
	}

	private boolean isValidUsername() {
		return username != null && username.matches("[A-Za-z0-9]{1,15}");
	}

	private boolean isValidPassword() {
		return password != null && password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*\\d.*") && password.matches(".*[!@#$%^&*()].*");
	}
}
