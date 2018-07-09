package com.example.polls.models;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * Package: com.example.polls.models
 * User: YuAn
 * Date: 2018/6/25
 * Time: 22:18
 * Project_name: polls
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
@AllArgsConstructor
public class ChoiceVoteCount {

   
    private Long choiceId;

    private Long voteCount;


}
