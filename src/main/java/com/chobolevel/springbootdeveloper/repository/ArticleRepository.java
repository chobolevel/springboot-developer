package com.chobolevel.springbootdeveloper.repository;

import com.chobolevel.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
