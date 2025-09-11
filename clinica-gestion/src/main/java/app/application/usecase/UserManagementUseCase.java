package app.application.usecase;

import app.domain.model.User;
import app.domain.repository.UserManagementPort;

public class UserManagementUseCase implements UserManagementPort {
	
	private final UserManagementPort userManagementPort;

	public UserManagementUseCase(UserManagementPort userManagementPort) {
		this.userManagementPort = userManagementPort;
	}

	public void createUser(User user, app.domain.model.enums.UserRole creatorRole) {
		// Validaciones de negocio
		if (userManagementPort.getUserById(user.getIdNumber()) != null) {
			throw new IllegalArgumentException("La cédula ya existe");
		}
                
		if (userManagementPort.getUserByUsername(user.getUsername()) != null) {
			throw new IllegalArgumentException("El nombre de usuario ya existe");
		}
                
		if (!user.getEmail().contains("@") || user.getEmail().length() > 50) {
			throw new IllegalArgumentException("Correo inválido");
		}
                
		if (!user.getPhoneNumber().matches("\\d{1,10}")) {
			throw new IllegalArgumentException("Teléfono inválido");
		}
                
		if (!user.getBirthDate().matches("\\d{2}/\\d{2}/\\d{4}")) {
			throw new IllegalArgumentException("Fecha de nacimiento inválida");
		}
                
		if (user.getAddress().length() > 30) {
			throw new IllegalArgumentException("Dirección demasiado larga");
		}
                
		if (user.getUsername().length() > 15 || !user.getUsername().matches("[A-Za-z0-9]+")) {
			throw new IllegalArgumentException("Nombre de usuario inválido");
		}
                
		if (user.getPassword().length() < 8 ||
			!user.getPassword().matches(".*[A-Z].*") ||
			!user.getPassword().matches(".*\\d.*") ||
			!user.getPassword().matches(".*[!@#$%^&*()].*")) {
			throw new IllegalArgumentException("Contraseña insegura");
		}
                
		
		if (creatorRole == null || creatorRole != app.domain.model.enums.UserRole.HR) {
			throw new IllegalArgumentException("Solo recursos humanos pueden crear usuarios");
		}
		userManagementPort.createUser(user, creatorRole);
	}

	@Override
	public void deleteUser(String idNumber) {
		userManagementPort.getUserById(idNumber);
	}

	@Override
	public User getUserById(String idNumber) {
		return userManagementPort.getUserById(idNumber);
	}

	@Override
	public User getUserByUsername(String username) {
		return userManagementPort.getUserByUsername(username);
	}
}
