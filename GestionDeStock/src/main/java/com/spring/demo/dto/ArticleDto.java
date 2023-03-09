package com.spring.demo.dto;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.spring.demo.model.Article;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ArticleDto {

	private Integer id;

	private String codeArticle;

	private String designation;

	private BigDecimal prixUnitaireHt;

	private BigDecimal tauxTva;

	private BigDecimal prixUnitaireTtc;

	private String photo;

	private CategorieDto categorie;

	@JsonIgnore
	private List<LigneCommandeClientDto> listLigneCommandeClient;

	@JsonIgnore
	private List<LigneCommandeFournisseurDto> listLigneCommandeFournissuer;

	@JsonIgnore
	private List<MtvStkDto> listMvtStk;

	public static ArticleDto fromEntity(Article article) {
		if (article == null)
			return null;

		return ArticleDto.builder()
				.id(article.getId())
				.codeArticle(article.getCodeArticle())
				.designation(article.getDesignation())
				.prixUnitaireHt(article.getPrixUnitaireHt())
				.tauxTva(article.getTauxTva())
				.prixUnitaireTtc(article.getPrixUnitaireTtc())
				.photo(article.getPhoto())
				.build();
	}

	public static Article toEntity(ArticleDto articleDto) {
		if (articleDto == null)
			return null;

		Article article = new Article();
		article.setId(articleDto.getId());
		article.setCodeArticle(articleDto.getCodeArticle());
		article.setDesignation(articleDto.getDesignation());
		article.setPrixUnitaireHt(articleDto.getPrixUnitaireHt());
		article.setTauxTva(articleDto.getTauxTva());
		article.setPrixUnitaireTtc(articleDto.getPrixUnitaireTtc());
		article.setPhoto(articleDto.getPhoto());

		return article;

	}

}
