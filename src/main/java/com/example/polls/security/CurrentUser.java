package com.example.polls.security;

import org.springframework.security.core.annotation.AuthenticationPrincipal;

import java.lang.annotation.*;

/**
 * Created with IntelliJ IDEA.
 * Package: com.example.polls.security
 * User: YuAn
 * Date: 2018/6/25
 * Time: 11:57
 * Project_name: polls
 * To change this template use File | Settings | File Templates.
 * Description:
 */

@Target({ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@AuthenticationPrincipal
public @interface CurrentUser {



//@Target({ElementType.PARAMETER, ElementType.TYPE})
//@Retention(RetentionPolicy.RUNTIME)
//@Documented
//@AuthenticationPrincipal

}
