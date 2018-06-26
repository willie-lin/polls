package com.example.polls.payload;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * Package: com.example.polls.payload
 * User: YuAn
 * Date: 2018/6/25
 * Time: 23:31
 * Project_name: polls
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
public class ChoiceResponse {

    private long id;

    private String text;

    private long voteCount;
}
