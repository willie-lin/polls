package com.example.polls.repository;

import com.example.polls.models.Role;
import com.example.polls.models.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created with IntelliJ IDEA.
 * Package: com.example.polls.repository
 * User: YuAn
 * Date: 2018/6/25
 * Time: 9:23
 * Project_name: polls
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
