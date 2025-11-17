package dev.sadiq.user_management.dto.request;

import lombok.Data;

@Data
public class CreateUserDto {
    private String firstName;
    private String lastName;
    private String pin;
    private String email;
    private String phoneNumber;
}
