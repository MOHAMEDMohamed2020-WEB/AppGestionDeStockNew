package com.spring.demo.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.spring.demo.dto.CategorieDto;

public class CategorieValidator {

	public static List<String> validate(CategorieDto categorieDto) {
		List<String> errors = new ArrayList<>();

		
		if (categorieDto == null) {
			errors.add("SVP enregistrer le code de la catégorie");
		}
		if (!StringUtils.hasLength(categorieDto.getCode())) {
			errors.add("SVP enregistrer le code de la catégorie");
		}
		return errors;
	}

}
