package dev.sadiq.user_management.service.handler;

import dev.sadiq.user_management.dto.request.CreateUserDto;
import dev.sadiq.user_management.dto.request.UpdateUserDto;
import dev.sadiq.user_management.entity.User;
import dev.sadiq.user_management.mapper.UserMapper;
import dev.sadiq.user_management.repository.UserRepository;
import dev.sadiq.user_management.service.abstraction.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public User findById(Long id) {
        return userRepository
                .findById(id)
                .orElseThrow(() ->
                        new ResponseStatusException(NOT_FOUND,
                                "User not found with id: " + id));
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void save(CreateUserDto dto) {
        var entity = userMapper.toEntity(dto);
        userRepository.save(entity);
    }

    @Override
    @Transactional
    public void update(Long id, UpdateUserDto dto) {
        var foundedUser = findById(id);
        userMapper.update(dto, foundedUser);

    }

    @Override
    @Transactional
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
