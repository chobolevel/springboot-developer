package com.chobolevel.springbootdeveloper.service;

import com.chobolevel.springbootdeveloper.domain.Article;
import com.chobolevel.springbootdeveloper.dto.CreateArticleRequestDto;
import com.chobolevel.springbootdeveloper.dto.UpdateArticleRequestDto;
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

    public Article findById(Long id) {
        return articleRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("not found: " + id));
    }

    public Article update(Long id, UpdateArticleRequestDto request) {
        Article article = articleRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("not found: " + id));
        article.update(request.getTitle(), request.getContent());
        return article;
    }

    public Boolean deleteById(Long id) {
        articleRepository.deleteById(id);
        return true;
    }

}
