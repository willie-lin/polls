package com.example.polls.payload;

import lombok.Data;
import lombok.NonNull;

/**
 * Created with IntelliJ IDEA.
 * Package: com.example.polls.payload
 * User: YuAn
 * Date: 2018/6/25
 * Time: 22:58
 * Project_name: polls
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
public class VoteRequest {

    @NonNull
    private Long choiceId;
}
