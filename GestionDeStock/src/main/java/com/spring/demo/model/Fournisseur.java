package com.spring.demo.model;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity

public class Fournisseur extends AbstractEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column
	private String nom;
	@Column
	private String prenom;
	@Embedded
	private Adresse adresse;
	@Column
	private String photo;
	@Column
	private String mail;
	@Column
	private String numTel;
	@OneToMany(mappedBy = "fournisseur")
	private List<CommandeFournisseur> listCommandeFournisseurs;
	@Column
	private Integer idEntrepise;

}
