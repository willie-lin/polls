package com.example.polls.payload;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.Instant;

/**
 * Created with IntelliJ IDEA.
 * Package: com.example.polls.payload
 * User: YuAn
 * Date: 2018/6/25
 * Time: 23:23
 * Project_name: polls
 * To change this template use File | Settings | File Templates.
 * Description:
 */

@Data
@AllArgsConstructor
public class UserProfile {

    private Long id;

    private String username;

    private String name;

    private Instant joinedAt;

    private Long pollCount;

    private Long voteCount;

}
