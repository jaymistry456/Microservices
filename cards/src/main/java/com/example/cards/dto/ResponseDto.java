package com.example.cards.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Schema(
        name = "Response",
        description = "Schema to hold successful reponse information"
)
public class ResponseDto {

    @Schema(
            description = "Status code for the successful response"
    )
    private String statusCode;

    @Schema(
            description = "Status message for the successful response"
    )
    private String statusMessage;

}
