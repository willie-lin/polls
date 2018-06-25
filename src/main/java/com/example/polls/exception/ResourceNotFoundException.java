package com.example.polls.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created with IntelliJ IDEA.
 * Package: com.example.polls.exception
 * User: YuAn
 * Date: 2018/6/25
 * Time: 13:54
 * Project_name: polls
 * To change this template use File | Settings | File Templates.
 * Description:
 */

@Data
@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

    private String resourceName;

    private String fieldName;

    private Object fieldValue;


    public ResourceNotFoundException(String resourceName, String fieldName, Object fieldValue){
        super(String.format("%s not found with %s : '%s'", resourceName, fieldName, fieldValue));;
        this.resourceName = resourceName;
        this.fieldName =fieldName;
        this.fieldValue = fieldValue;
    }


}
