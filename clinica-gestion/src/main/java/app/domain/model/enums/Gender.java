package app.domain.model.enums;

public enum Gender {
	MALE("Masculino"),
	FEMALE("Femenino"),
	OTHER("Otro");

	private final String gender;

	Gender(String gender) {
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public static Gender fromDescription(String genderSearch) {
		for (Gender g : Gender.values()) {
			if (g.gender.equalsIgnoreCase(genderSearch)) {
				return g;
			}
		}
		throw new IllegalArgumentException("Género no encontrado: " + genderSearch);
	}
}
