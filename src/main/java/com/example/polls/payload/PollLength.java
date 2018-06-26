package com.example.polls.payload;

import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

/**
 * Created with IntelliJ IDEA.
 * Package: com.example.polls.payload
 * User: YuAn
 * Date: 2018/6/25
 * Time: 22:50
 * Project_name: polls
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
public class PollLength {

    @NonNull
    @Max(7)
    private Integer days;

    @NonNull
    @Max(23)
    private Integer hours;


    @NonNull
    @Max(59)
    private Integer minute;
}
