package com.example.polls.payload;

import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Package: com.example.polls.payload
 * User: YuAn
 * Date: 2018/6/25
 * Time: 22:42
 * Project_name: polls
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Data
public class PollRequest {

    @NotBlank
    @Size(max = 140)
    private String question;

    @NotNull
    @Size(min = 2, max = 12)
    private List<ChoiceRequest> choices;

    @NonNull
    @Valid
    private PollLength pollLength;


}
