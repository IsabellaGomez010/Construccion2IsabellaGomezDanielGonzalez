
package app.domain.model.enums;

public enum UserRole {
	HR("Recursos Humanos"),
	ADMINISTRATIVE_STAFF("Personal Administrativo"),
	INFORMATION_SUPPORT("Soporte de Información"),
	NURSE("Enfermera"),
	DOCTOR("Médico");

	private final String role;

	UserRole(String role) {
		this.role = role;
	}

	public String getRole() {
		return role;
	}

	public static UserRole fromDescription(String roleSearch) {
		for (UserRole userRole : UserRole.values()) {
			if (userRole.role.equalsIgnoreCase(roleSearch)) {
				return userRole;
			}
		}
		throw new IllegalArgumentException("Rol no encontrado: " + roleSearch);
	}
}
