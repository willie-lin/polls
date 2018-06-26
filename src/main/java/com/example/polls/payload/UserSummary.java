package com.example.polls.payload;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * Package: com.example.polls.payload
 * User: YuAn
 * Date: 2018/6/25
 * Time: 22:59
 * Project_name: polls
 * To change this template use File | Settings | File Templates.
 * Description:
 */

@Data
@AllArgsConstructor
public class UserSummary {

    private Long id;
    private String username;
    private String name;


}
