package tech.backend.twittersimplificado.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.backend.twittersimplificado.entity.User;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    Optional<User> findByUsername(String username);
}
