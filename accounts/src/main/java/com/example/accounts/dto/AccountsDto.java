package com.example.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDto {

    @Schema(
            name = "Account number"
    )
    @NotEmpty(message = "Account Number field can not be empty.")
    @Pattern(regexp = "^\\d{10}$", message = "Account number must be exactly 10 digits long")
    private Long accountNumber;

    @Schema(
            name = "Account type",
            example = "Savings"
    )
    @NotEmpty(message = "Account type can not be empty.")
    private String accountType;

    @Schema(
            name = "Branch Address"
    )
    @NotEmpty(message = "Branch Address can not be empty.")
    private String branchAddress;

}
