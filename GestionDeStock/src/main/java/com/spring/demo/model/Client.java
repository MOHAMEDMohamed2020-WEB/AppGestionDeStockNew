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

public class Client extends AbstractEntity {
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

	@OneToMany(mappedBy = "client")
	private List<CommandeClient> listCommandeClients;
	@Column
	private Integer idEntrepise;

}
