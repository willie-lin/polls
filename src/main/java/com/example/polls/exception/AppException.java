package com.example.polls.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created with IntelliJ IDEA.
 * Package: com.example.polls.exception
 * User: YuAn
 * Date: 2018/6/25
 * Time: 13:15
 * Project_name: polls
 * To change this template use File | Settings | File Templates.
 * Description:
 */

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class AppException extends RuntimeException {

    public AppException(String message){
        super(message);
    }

    public AppException(String message, Throwable cause){
        super(message, cause);
    }
}
