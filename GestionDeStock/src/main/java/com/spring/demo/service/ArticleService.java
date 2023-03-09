package com.spring.demo.service;

import java.util.List;
import com.spring.demo.dto.ArticleDto;


public interface ArticleService {

	ArticleDto save(ArticleDto dto);

	ArticleDto findById(Integer id);

	ArticleDto findByCodeArticle(String codeArticle);

	List<ArticleDto> findAll(ArticleDto dto);

	void delete(Integer id);

}
