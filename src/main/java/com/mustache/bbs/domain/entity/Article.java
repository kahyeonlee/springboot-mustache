package com.mustache.bbs.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity //jpa에서 객체로 다루겠다는 선언
@NoArgsConstructor
@Getter
@Table(name="article")
public class Article {
    @Id // entity 사용할때, 필수 primary key를 의미함
    @GeneratedValue(strategy = GenerationType.IDENTITY) //db에 id생성 자동으로 맡김
    private long id;

    private String title;
    private String content;

    public Article(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
