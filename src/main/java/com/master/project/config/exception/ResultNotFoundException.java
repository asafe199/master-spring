package com.master.project.config.exception;

import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@NoArgsConstructor
@ResponseStatus(HttpStatus.NO_CONTENT)
public class ResultNotFoundException extends RuntimeException{

    public ResultNotFoundException(String message) {
        super(message);
    }
}
