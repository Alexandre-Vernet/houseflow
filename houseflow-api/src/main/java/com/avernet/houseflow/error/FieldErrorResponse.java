package com.avernet.houseflow.error;

public record FieldErrorResponse(
    String field,
    String message
) {
}
