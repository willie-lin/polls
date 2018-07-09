package com.example.polls.models;

import com.example.polls.models.audit.UserDateAudit;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Package: com.example.polls.models
 * User: YuAn
 * Date: 2018/6/25
 * Time: 17:45
 * Project_name: polls
 * To change this template use File | Settings | File Templates.
 * Description:
 */


@Data
@Entity
@Table(name = "polls")
public class Poll extends UserDateAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   
    @NotBlank
    @Size(max = 140)
    private String question;


    @OneToMany(
            mappedBy = "poll",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            orphanRemoval = true
    )
    @Size(min = 2, max = 12)
    @Fetch(FetchMode.SELECT)
    @BatchSize(size = 32)
    private List<Choice> choices = new ArrayList<>();

   
    @NotNull
    private Instant expirationDateTime;


    public void addChoice(Choice choice){
        choices.add(choice);
        choice.setPoll(this);
    }

    public void removeChoice(Choice choice){
        choices.remove(choice);
        choice.setPoll(null);
    }
}
