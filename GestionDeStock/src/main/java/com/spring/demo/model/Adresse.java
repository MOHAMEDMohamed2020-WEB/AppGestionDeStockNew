package com.spring.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Embeddable
public class Adresse {

	@Column
	private String adresse1;
	@Column
	private String adresse2;
	@Column
	private String ville;
	@Column
	private String codePostal;
	@Column
	private String rue;
	@Column
	private String paye;


}
