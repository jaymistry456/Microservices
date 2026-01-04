package com.example.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Data
@Schema(
        name = "Loans",
        description = "Schema to hold Loan information"
)
public class LoansDto {

    @NotEmpty(message = "Mobile number can not be empty.")
    @Pattern(regexp = "^\\d{10}$", message = "Mobile number must be exactly 10 digits longs.")
    @Schema(
            description = "Mobile number of the Customer",
            example = "1234567890"
    )
    private String mobileNumber;

    @NotEmpty(message = "Loan number can not be empty.")
    @Pattern(regexp = "^\\d{12}$", message = "Loan number must be exactly 12 digits long.")
    @Schema(
            description = "Loan number of the Customer",
            example = "123456789012"
    )
    private String loanNumber;

    @NotEmpty(message = "Loan type can not be empty.")
    @Schema(
            description = "Type of the Loan",
            example = "Home Loan"
    )
    private String loanType;

    @Positive(message = "Total loan amount must be positive")
    @Schema(
            description = "Total loan amount",
            example = "100000"
    )
    private int totalLoan;

    @PositiveOrZero(message = "Amount paid must be equal to or greater than zero")
    @Schema(
            description = "Amount paid towards the loan",
            example = "2000"
    )
    private int amountPaid;

    @PositiveOrZero(message = "Outstanding amount must be equal to or greater than zero")
    @Schema(
            description = "Outstanding amount of the loan",
            example = "98000"
    )
    private int outstandingAmount;
}
