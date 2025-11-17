package dev.sadiq.user_management.mapper;

import dev.sadiq.user_management.dto.request.CreateUserDto;
import dev.sadiq.user_management.dto.request.UpdateUserDto;
import dev.sadiq.user_management.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface UserMapper {
    User toEntity(CreateUserDto dto);
    void update(UpdateUserDto dto, @MappingTarget User user);
}
