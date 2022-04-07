package com.dinesh.apps.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
public class HttpResponse {
    private String httpCode;
    private String status;
    private HttpStatus httpStatus;
    private String message;
}
