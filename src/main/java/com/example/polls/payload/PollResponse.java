package com.example.polls.payload;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.time.Instant;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Package: com.example.polls.payload
 * User: YuAn
 * Date: 2018/6/25
 * Time: 23:29
 * Project_name: polls
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
public class PollResponse {

    private Long id;

    private String question;

    private List<ChoiceResponse> choices;

    private UserSummary createdBy;

    private Instant creationDateTime;

    private Instant expirationDateTime;

    private Boolean isExpired;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long selectedChoice;

    private Long totalVotes;
}
