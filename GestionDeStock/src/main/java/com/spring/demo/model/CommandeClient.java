package com.spring.demo.model;
import java.time.Instant;
import java.util.List;

import jakarta.persistence.Column;
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

public class CommandeClient extends AbstractEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column
	private String code;
	@Column
	private Instant dateCommande;

	@ManyToOne
	private Client client;

	@OneToMany(mappedBy = "commandeClient")
	private List<LigneCommandeClient> listLigneCommandeClient;
	@Column
	private Integer idEntrepise;
}
