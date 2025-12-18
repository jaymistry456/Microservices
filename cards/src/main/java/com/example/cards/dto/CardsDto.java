package com.example.cards.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Data
@Schema(
        name = "Cards",
        description = "Schema to hold Card information"
)
public class CardsDto {

    @NotEmpty(message = "Mobile Number can not be empty.")
    @Pattern(regexp = "^\\d{10}$", message = "Mobile number must be exactly 10 digits long.")
    @Schema(
            description = "Mobile number of the Customer",
            example = "1234567890"
    )
    private String mobileNumber;

    @NotEmpty(message = "Card Number can not be empty.")
    @Pattern(regexp = "^\\d{12}$", message = "Card number must be exactly 12 digits long.")
    @Schema(
            description = "Card number of the customer",
            example = "123456789012"
    )
    private String cardNumber;

    @NotEmpty(message = "Card type can not be empty.")
    @Schema(
            description = "Type of the card",
            example = "Credit Card"
    )
    private String cardType;

    @Positive(message = "Total card limit should be greater than zero.")
    @Schema(
            description = "Total amount limit against the card",
            example = "100000"
    )
    private int totalLimit;

    @PositiveOrZero(message = "Total amount used should be equal or greater than zero.")
    @Schema(
            description = "Total amount used from the card",
            example = "2000"
    )
    private int amountUsed;

    @PositiveOrZero(message = "Total available amount should be equal or greater than zero.")
    @Schema(
            description = "Total available amount in the card",
            example = "98000"
    )
    private int availableAmount;

}
