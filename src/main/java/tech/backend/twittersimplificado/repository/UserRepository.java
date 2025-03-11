package tech.backend.twittersimplificado.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.backend.twittersimplificado.entity.User;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
