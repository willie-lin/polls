package com.example.polls.models;

import com.example.polls.models.audit.DateAudit;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Package: com.example.polls.models
 * User: YuAn
 * Date: 2018/6/25
 * Time: 8:40
 * Project_name: polls
 * To change this template use File | Settings | File Templates.
 * Description:
 */

@Entity
@Data
@Table(name = "user", uniqueConstraints = {
        @UniqueConstraint(columnNames = {
                "username"
        }),
        @UniqueConstraint(columnNames = {
                "email"
        })
})
public class User extends DateAudit {
//public class User {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Getter
    @Setter
    @NotBlank
    @Size(max = 40)
    private String name;


    @Getter
    @Setter
    @NotBlank
    @Size(max = 15)
    private String username;


    @Getter
    @Setter
    @NaturalId
    @NotBlank
    @Size(max = 40)
    @Email
    private String email;

    @Getter
    @Setter
    @NotBlank
    @Size(max = 180)
    private String password;


    @Getter
    @Setter
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_roles",
    joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<Role> roles = new HashSet<>();

    public User(String name, String username, String email, String password) {

        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public User() {

    }

}
