package com.fares.gestiondestock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.fares.gestiondestock.controller.api.ArticleApi;
import com.fares.gestiondestock.dto.ArticleDto;
import com.fares.gestiondestock.services.ArticleService;


@RestController
public class ArticleController implements ArticleApi {

	
	private ArticleService articleService;
	
	@Autowired
	public ArticleController(ArticleService articleService) {
		this.articleService = articleService;
	}

	@Override
	public ArticleDto save(ArticleDto dto) {
		
		return articleService.save(dto);
	}

	@Override
	public ArticleDto findById(Integer id) {
	
		return articleService.findById(id);
	}

	@Override
	public ArticleDto findByCodeArticle(String codeArticle) {
		
		return articleService.findByCodeArticle(codeArticle);
	}

	@Override
	public List<ArticleDto> findAll() {
		
		return articleService.findAll();
	}

	@Override
	public void delete(Integer id) {
		 articleService.delete(id);
		
	}

}
