package com.example.polls.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * Package: com.example.polls.models
 * User: YuAn
 * Date: 2018/6/25
 * Time: 9:05
 * Project_name: polls
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
@Entity
@Table(name = "roles")
public class Role {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    
    @Enumerated(EnumType.STRING)
    @NaturalId
    @Column(length = 60)
    private RoleName name;
}
