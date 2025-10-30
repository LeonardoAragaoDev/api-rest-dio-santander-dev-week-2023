package api.rest.dio.santander.service;

import api.rest.dio.santander.domain.model.User;

public interface UserService {

	User findById(Long id);

	User create(User user);

}
