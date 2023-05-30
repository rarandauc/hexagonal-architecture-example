package co.edu.ucatolica.hexa.infra.adapters.output.persistence.repository;

import co.edu.ucatolica.hexa.infra.adapters.output.persistence.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}
