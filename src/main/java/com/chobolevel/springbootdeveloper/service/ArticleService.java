package com.chobolevel.springbootdeveloper.service;

import com.chobolevel.springbootdeveloper.domain.Article;
import com.chobolevel.springbootdeveloper.dto.CreateArticleRequestDto;
import com.chobolevel.springbootdeveloper.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleService {

    private final ArticleRepository articleRepository;

    public Article save(CreateArticleRequestDto request) {
        return articleRepository.save(request.toEntity());
    }

    public List<Article> findAll() {
        return articleRepository.findAll();
    }

}
