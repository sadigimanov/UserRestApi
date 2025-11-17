package dev.sadiq.user_management.dto.request;

import lombok.Data;

@Data
public class UpdateUserDto {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
}
