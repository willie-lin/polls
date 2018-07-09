package com.example.polls.payload;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.AssertTrue;

/**
 * Created with IntelliJ IDEA.
 * Package: com.example.polls.payload
 * User: YuAn
 * Date: 2018/6/25
 * Time: 23:13
 * Project_name: polls
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
@AllArgsConstructor
public class UserIdentityAvailability {

    private Boolean available;

}
