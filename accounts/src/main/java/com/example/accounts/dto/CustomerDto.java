package com.example.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold Customer and their corresponding Account information"
)
public class CustomerDto {

    @Schema(
            description = "Name of the customer",
            example = "John Doe"
    )
    @NotEmpty(message = "Name can not be empty.")
    @Size(min = 5, max = 30, message = "Name should be between 5 and 30 characters long.")
    private String name;

    @Schema(
            description = "Email address of the customer",
            example = "johndoe@example.com"
    )
    @NotEmpty(message = "Email can not be empty.")
    @Email(message = "Please enter a valid email address.")
    private String email;

    @Schema(
            description = "Mobile number of the customer",
            example = "12334567890"
    )
    @NotEmpty(message = "Mobile number can not be empty.")
    @Pattern(regexp = "^\\d{10}$", message = "Mobile number should be exactly 10 digits long.")
    private String mobileNumber;

    @Schema(
            description = "Account details of the customer"
    )
    private AccountsDto accountsDto;

}
