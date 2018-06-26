package com.example.polls.payload;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Package: com.example.polls.payload
 * User: YuAn
 * Date: 2018/6/26
 * Time: 0:21
 * Project_name: polls
 * To change this template use File | Settings | File Templates.
 * Description:
 */

@Data
@AllArgsConstructor
public class PagedResponse<T> {

    private List<T> content;

    private int page;

    private int size;

    private long totalElements;

    private int totalPages;

    private boolean last;

    public PagedResponse(){

    }

    public PagedResponse(List<T> content, int page, int size, long totalElements, int totalPages, boolean last) {
        this.content = content;
        this.page = page;
        this.size = size;
        this.totalElements = totalElements;
        this.totalPages = totalPages;
        this.last = last;
    }
}
