package app.application.usecase;

import app.application.port.in.UserManagementUseCase;
import app.domain.model.User;
import app.domain.repository.UserRepository;

public class UserManagementService implements UserManagementUseCase {
	private final UserRepository userRepository;

	public UserManagementService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public void createUser(User user) {
		userRepository.save(user);
	}

	@Override
	public void deleteUser(String idNumber) {
		userRepository.deleteByIdNumber(idNumber);
	}

	@Override
	public User getUserById(String idNumber) {
		return userRepository.findByIdNumber(idNumber);
	}

	@Override
	public User getUserByUsername(String username) {
		return userRepository.findByUsername(username);
	}
}
