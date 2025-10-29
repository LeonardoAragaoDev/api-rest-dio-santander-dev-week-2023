package api.rest.dio.santander.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.rest.dio.santander.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
