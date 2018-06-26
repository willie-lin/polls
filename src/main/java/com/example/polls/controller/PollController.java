package com.example.polls.controller;

import com.example.polls.repository.PollRepository;
import com.example.polls.repository.UserRepository;
import com.example.polls.repository.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Package: com.example.polls.controller
 * User: YuAn
 * Date: 2018/6/26
 * Time: 10:37
 * Project_name: polls
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@RestController
@RequestMapping("/api/polls")
public class PollController {


    @Autowired
    private PollRepository pollRepository;

    @Autowired
    private VoteRepository voteRepository;

    @Autowired
    private UserRepository userRepository;


}
