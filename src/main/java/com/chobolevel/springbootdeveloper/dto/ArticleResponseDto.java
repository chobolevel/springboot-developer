package com.chobolevel.springbootdeveloper.dto;

import com.chobolevel.springbootdeveloper.domain.Article;
import lombok.Getter;

@Getter
public class ArticleResponseDto {

    private final String title;
    private final String content;

    public ArticleResponseDto(Article article) {
        this.title = article.getTitle();
        this.content = article.getContent();
    }

}
