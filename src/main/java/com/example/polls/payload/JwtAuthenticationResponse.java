package com.example.polls.payload;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Created with IntelliJ IDEA.
 * Package: com.example.polls.payload
 * User: YuAn
 * Date: 2018/6/25
 * Time: 13:10
 * Project_name: polls
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
public class JwtAuthenticationResponse {

    @Getter
    @Setter
    private String accessToken;

    @Getter
    @Setter
    private String tokenType = "Bearer";

    public JwtAuthenticationResponse(String accessToken){
        this.accessToken = accessToken;
    }

}
