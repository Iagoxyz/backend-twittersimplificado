package tech.backend.twittersimplificado.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.backend.twittersimplificado.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
