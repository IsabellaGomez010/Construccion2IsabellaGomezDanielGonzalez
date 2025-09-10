package app.domain.model.enums;

public enum OrderItemType {
	MEDICATION("Medicamento"),
	PROCEDURE("Procedimiento"),
	DIAGNOSTIC_AID("Ayuda diagnóstica");

	private final String itemType;

	OrderItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getItemType() {
		return itemType;
	}

	public static OrderItemType fromDescription(String typeSearch) {
		for (OrderItemType t : OrderItemType.values()) {
			if (t.itemType.equalsIgnoreCase(typeSearch)) {
				return t;
			}
		}
		throw new IllegalArgumentException("Tipo de ítem no encontrado: " + typeSearch);
	}
}
