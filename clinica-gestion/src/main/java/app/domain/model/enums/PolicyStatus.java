package app.domain.model.enums;

public enum PolicyStatus {
	ACTIVE("Activa"),
	INACTIVE("Inactiva");

	private final String status;

	PolicyStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public static PolicyStatus fromDescription(String statusSearch) {
		for (PolicyStatus s : PolicyStatus.values()) {
			if (s.status.equalsIgnoreCase(statusSearch)) {
				return s;
			}
		}
		throw new IllegalArgumentException("Estado de póliza no encontrado: " + statusSearch);
	}
}
