package com.example.AddressBook.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class AuthUserDTO {

    @NotNull(message = "First name is required")
    @Pattern(regexp = "^[A-Z][a-zA-Z]*$", message = "First Name should always start with a capital letter and contain only letters")
    private String firstName;

    @NotNull(message = "Last name is required")
    @Pattern(regexp = "^[A-Z][a-zA-Z]*$", message = "Last Name should always start with a capital letter and contain only letters")
    private String lastName;

    @NotNull(message = "Email is required")
    @Email(message = "Must be a valid email")
    @Column(unique = true)
    private String email;

    @NotNull(message = "Password is required")
    @Pattern(regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
            message = "Password must be at least 8 characters long, contain an uppercase letter, a lowercase letter, a number, and a special character")
    private String password;

}