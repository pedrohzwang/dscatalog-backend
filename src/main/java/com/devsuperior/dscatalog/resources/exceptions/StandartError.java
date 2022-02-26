package com.devsuperior.dscatalog.resources.exceptions;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Data
public class StandartError {

    private Instant timestamp;
    private Integer status;
    private String error;
    private String message;
    private String path;
}
