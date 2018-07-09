package com.example.polls.repository;

import com.example.polls.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Created with IntelliJ IDEA.
 * Package: com.example.polls.repository
 * User: YuAn
 * Date: 2018/6/25
 * Time: 9:17
 * Project_name: polls
 * To change this template use File | Settings | File Templates.
 * Description:
 * @author SYSTEM
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    Optional<User> findByUsernameOrEmail(String username, String email);

    List<User> findByIdIn(List<Long> userIds);

    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
