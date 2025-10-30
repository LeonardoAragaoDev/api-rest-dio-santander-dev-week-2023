package api.rest.dio.santander.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import api.rest.dio.santander.domain.model.User;
import api.rest.dio.santander.domain.repository.UserRepository;
import api.rest.dio.santander.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public User findById(Long id) {
		return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
	}

	@Override
	public User create(User user) {
		if (userRepository.existsByAccountNumber(user.getAccount().getNumber())) {
			throw new IllegalArgumentException("This Account number already exists.");
		}

		return userRepository.save(user);
	}

}
