package com.chobolevel.springbootdeveloper.dto;

import com.chobolevel.springbootdeveloper.domain.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class CreateArticleRequestDto {
    private String title;
    private String content;

    public Article toEntity() {
        return Article
                .builder()
                .title(title)
                .content(content)
                .build();
    }

}
