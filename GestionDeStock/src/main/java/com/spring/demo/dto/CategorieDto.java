package com.spring.demo.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.spring.demo.model.Article;
import com.spring.demo.model.Categorie;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategorieDto {

	private Integer id;
	private String code;
	private String designation;
	@JsonIgnore
	private List<Article> listeArticles;
	
	public static CategorieDto fromEntity(Categorie categorie) {
		if (categorie == null)
			return null;
		return CategorieDto.builder()
				.id(categorie.getId())
				.code(categorie.getCode())
				.designation(categorie.getDesignation())
				.build();
	}
	public static Categorie toEntity(CategorieDto categorieDto) {
		if (categorieDto == null)
			return null;
		Categorie categorie = new Categorie();
		categorie.setId(categorieDto.getId());
		categorie.setCode(categorieDto.getCode());
		categorie.setDesignation(categorieDto.getDesignation());
		return categorie;
	}
}
