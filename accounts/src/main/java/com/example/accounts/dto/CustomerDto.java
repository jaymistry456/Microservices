package com.example.accounts.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CustomerDto {

    @NotEmpty(message = "Name can not be empty.")
    @Size(min = 5, max = 30, message = "Name should be between 5 and 30 characters long.")
    private String name;

    @NotEmpty(message = "Email can not be empty.")
    @Email(message = "Please enter a valid email address.")
    private String email;

    @NotEmpty(message = "Mobile number can not be empty.")
    @Pattern(regexp = "^\\d{10}$", message = "Mobile number should be exactly 10 digits long.")
    private String mobileNumber;

    private AccountsDto accountsDto;

}
