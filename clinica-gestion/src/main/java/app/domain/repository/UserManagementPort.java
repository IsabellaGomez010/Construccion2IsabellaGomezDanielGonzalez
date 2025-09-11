package app.domain.repository;

import app.domain.model.User;

public interface UserManagementPort {
	void createUser(User user, app.domain.model.enums.UserRole creatorRole);
	void deleteUser(String idNumber);
	User getUserById(String idNumber);
	User getUserByUsername(String username);
}
