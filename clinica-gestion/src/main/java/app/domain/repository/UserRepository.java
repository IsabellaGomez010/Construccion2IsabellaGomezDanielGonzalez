package app.domain.port;

import app.domain.model.User;


public interface UserRepository {
	void save(User user);
	void deleteByIdNumber(String idNumber);
	User findByIdNumber(String idNumber);
	User findByUsername(String username);
	boolean existsByIdNumber(String idNumber);
	boolean existsByUsername(String username);
}
