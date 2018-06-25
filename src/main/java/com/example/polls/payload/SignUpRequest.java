package com.example.polls.payload;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * Created with IntelliJ IDEA.
 * Package: com.example.polls.payload
 * User: YuAn
 * Date: 2018/6/25
 * Time: 12:06
 * Project_name: polls
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
public class SignUpRequest {

    @Getter
    @Setter
    @NotBlank
    @Size(min = 4, max = 40)
    private String name;


    @Getter
    @Setter
    @NotBlank
    @Size(min = 3, max = 15)
    private String username;


    @Getter
    @Setter
    @NotBlank
    @Size(max = 40)
    @Email
    private String email;

    @Getter
    @Setter
    @NotBlank
    @Size(min = 6, max = 20)
    private String password;
}
