package app.application.port.in;

import app.domain.model.User;

public interface UserManagementUseCase {
	void createUser(User user);
	void deleteUser(String idNumber);
	User getUserById(String idNumber);
	User getUserByUsername(String username);
}
