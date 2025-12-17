package com.example.accounts.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class AccountsDto {

    @NotEmpty(message = "Account Number field can not be empty.")
    @Pattern(regexp = "^\\d{10}$", message = "Account number must be exactly 10 digits long")
    private Long accountNumber;

    @NotEmpty(message = "Account Type can not be empty.")
    private String accountType;

    @NotEmpty(message = "Branch Address can not be empty.")
    private String branchAddress;

}
