package com.example.polls.models;

import com.example.polls.models.audit.DateAudit;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.aop.framework.autoproxy.target.AbstractBeanFactoryBasedTargetSourceCreator;

import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * Package: com.example.polls.models
 * User: YuAn
 * Date: 2018/6/25
 * Time: 18:10
 * Project_name: polls
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
@Entity
@Table(name = "votes", uniqueConstraints = {
        @UniqueConstraint(columnNames = {
                "poll_id",
                "user_id"
        })
})
public class Vote extends DateAudit {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "poll_id", nullable = false)
    private Poll poll;



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "choice_id", nullable = false)
    private Choice choice;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
