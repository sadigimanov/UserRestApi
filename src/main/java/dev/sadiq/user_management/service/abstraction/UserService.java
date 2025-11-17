package dev.sadiq.user_management.service.abstraction;

import dev.sadiq.user_management.dto.request.CreateUserDto;
import dev.sadiq.user_management.dto.request.UpdateUserDto;
import dev.sadiq.user_management.entity.User;

import java.util.List;

public interface UserService {
    User findById(Long id);
    List<User> findAll();
    void save(CreateUserDto dto);
    void update(Long id, UpdateUserDto dto);
    void delete(Long id);
}
