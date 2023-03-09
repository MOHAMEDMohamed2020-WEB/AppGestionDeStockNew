package com.spring.demo.model;

import java.math.BigDecimal;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity

public class LigneCommandeClient extends AbstractEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne
	private Article article;
	@ManyToOne
	private CommandeClient commandeClient;
	
	@Column
	private BigDecimal quantite;
	
	@Column
	private BigDecimal prixUnitaire;
	@Column
	private Integer idEntrepise;

}
