package dev.sadiq.user_management.repository;

import dev.sadiq.user_management.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
