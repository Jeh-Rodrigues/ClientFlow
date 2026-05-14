package com.clientflow.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class FieldMessage {

    private String fieldName;
    private String message;
}
