package com.example.polls.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 * Package: com.example.polls.models
 * User: YuAn
 * Date: 2018/6/25
 * Time: 17:51
 * Project_name: polls
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
@Entity
@Table(name = "choices")
public class Choice {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 40)
    
    
    private String text;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "poll_id", nullable = false)
    private Poll poll;


    public Choice(){

    }


    public Choice(String text){
        this.text = text;

    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) {
//            return true;
//        }
//        if (o == null || getClass() != o.getClass()) {
//            return false;
//        }
//        Choice choice = (Choice) o;
//        return Objects.equals(id, choice.id);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }
}
