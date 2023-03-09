package com.spring.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.demo.dto.ArticleDto;
import com.spring.demo.repository.ArticleRepository;
import com.spring.demo.service.ArticleService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
//@Log4j  //autowired @qualifier("nom_service")

public class ArticleServiceImpl implements ArticleService {

	private ArticleRepository articleRepository;

	@Autowired
	public ArticleServiceImpl(ArticleRepository articleRepository) {
		this.articleRepository = articleRepository;
	}

	@Override
	public ArticleDto save(ArticleDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArticleDto findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArticleDto findByCodeArticle(String codeArticle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ArticleDto> findAll(ArticleDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

}
