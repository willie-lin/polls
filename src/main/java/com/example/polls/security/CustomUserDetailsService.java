package com.example.polls.security;

import com.example.polls.models.User;
import com.example.polls.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with IntelliJ IDEA.
 * Package: com.example.polls.security
 * User: YuAn
 * Date: 2018/6/25
 * Time: 10:50
 * Project_name: polls
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Service
public class CustomUserDetailsService implements UserDetailsService {


    @Autowired
    UserRepository userRepository;


    @Override
    @Transactional
    public UserDetails loadUserByUsername(String usernameOrEmail) throws UsernameNotFoundException {

        User user = userRepository.findByUsernameOrEmail(usernameOrEmail,usernameOrEmail)
                .orElseThrow(() ->
                new UsernameNotFoundException("User not found with username or email：" + usernameOrEmail));
        return UserPrincipal.create(user);
    }


    @Transactional
    public UserDetails loadUserById(Long id){
        User user = userRepository.findById(id).orElseThrow(
                () ->
                        new UsernameNotFoundException("User not found with id：" + id)
        );
        return UserPrincipal.create(user);
    }
}
