package com.spring.demo.model;

import java.time.Instant;
import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
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

public class Utilisiateur extends AbstractEntity {

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
	private String email;
	@Column
	private Instant dateDeNaissance;
	@Column
	private String motDePasse;
	@Column
	private String photo;
	@ManyToOne
	private Entreprise entreprise;
	@OneToMany(mappedBy = "utilisateur")
	private List<Role> roles;
	@Column
	private String mail;
	@Column
	private String numTel;

}
