package com.example.polls.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * Created with IntelliJ IDEA.
 * Package: com.example.polls.payload
 * User: YuAn
 * Date: 2018/6/25
 * Time: 22:48
 * Project_name: polls
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
@AllArgsConstructor
public class ChoiceRequest {

    @NotBlank
    @Size(max = 40)
    private String text;

}
