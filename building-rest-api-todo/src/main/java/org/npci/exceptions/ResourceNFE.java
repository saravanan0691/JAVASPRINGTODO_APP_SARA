package org.npci.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNFE extends RuntimeException{

    public ResourceNFE(String message) {
        super(message);
    }
}