package com.mustache.bbs.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity //jpa에서 객체로 다루겠다는 선언
@NoArgsConstructor
@Getter
public class Article {
    @Id // entity 사용할때, 필수 primary key를 의미함
    @GeneratedValue
    private long id;

    private String title;
    private String contents;

    public Article(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }
}
