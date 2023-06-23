package com.example.contents.exceptions;

import com.example.contents.dto.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class UserNotFoundException extends Status404Exception {
    public UserNotFoundException() {
        super("target user not found");
    }

    @ExceptionHandler(Status404Exception.class)
    public ResponseEntity<ResponseDto> handle404(
            Status404Exception exception
    ) {
        ResponseDto response = new ResponseDto();
        response.setMessage(exception.getMessage());
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(response);
    }
}
