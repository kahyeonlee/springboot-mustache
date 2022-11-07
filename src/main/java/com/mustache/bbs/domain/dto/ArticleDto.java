package com.mustache.bbs.domain.dto;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ArticleDto {
    private String id;
    private String title;
    private String content;

    public ArticleDto(String id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }
}

