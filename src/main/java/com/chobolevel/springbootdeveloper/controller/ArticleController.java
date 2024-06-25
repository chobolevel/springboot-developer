package com.chobolevel.springbootdeveloper.controller;

import com.chobolevel.springbootdeveloper.domain.Article;
import com.chobolevel.springbootdeveloper.dto.ArticleResponseDto;
import com.chobolevel.springbootdeveloper.dto.CreateArticleRequestDto;
import com.chobolevel.springbootdeveloper.dto.UpdateArticleRequestDto;
import com.chobolevel.springbootdeveloper.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class ArticleController {

    private final ArticleService articleService;

    @PostMapping("/articles")
    public ResponseEntity<Article> addArticle(@RequestBody CreateArticleRequestDto request) {
        Article result = articleService.save(request);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/articles")
    public ResponseEntity<List<ArticleResponseDto>> getAllArticles() {
        List<ArticleResponseDto> articles = articleService.findAll().stream().map(ArticleResponseDto::new).toList();
        return ResponseEntity.ok(articles);
    }

    @GetMapping("/articles/{id}")
    public ResponseEntity<ArticleResponseDto> getArticleById(@PathVariable Long id) {
        Article article = articleService.findById(id);
        return ResponseEntity.ok(new ArticleResponseDto(article));
    }

    @PutMapping("/articles/{id}")
    public ResponseEntity<Article> updateArticleById(@PathVariable Long id, @RequestBody UpdateArticleRequestDto request) {
        Article result = articleService.update(id, request);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/articles/{id}")
    public ResponseEntity<Boolean> deleteArticleById(@PathVariable Long id) {
        Boolean result = articleService.deleteById(id);
        return ResponseEntity.ok(result);
    }

}
