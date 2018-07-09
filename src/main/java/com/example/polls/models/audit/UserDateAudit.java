package com.example.polls.models.audit;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Created with IntelliJ IDEA.
 * Package: com.example.polls.models.audit
 * User: YuAn
 * Date: 2018/6/25
 * Time: 17:31
 * Project_name: polls
 * To change this template use File | Settings | File Templates.
 * Description:
 */

@Data
@MappedSuperclass
@JsonIgnoreProperties(
        value = {"createdBy", "updatedBy"},
        allowGetters = true
)
public abstract class UserDateAudit extends DateAudit {

    @CreatedBy
    @Column(updatable = false)
    private Long createdBy;


    @LastModifiedBy
    private Long updatedBy;
}
