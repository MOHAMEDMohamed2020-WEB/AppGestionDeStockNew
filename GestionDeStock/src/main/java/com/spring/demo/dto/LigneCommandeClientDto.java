package com.spring.demo.dto;

import java.math.BigDecimal;

import com.spring.demo.model.Article;
import com.spring.demo.model.CommandeClient;
import com.spring.demo.model.LigneCommandeClient;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LigneCommandeClientDto {

	private Integer id;
	private Article article;
	private CommandeClient commandeClient;
	private BigDecimal quantite;
	private BigDecimal prixUnitaire;
	
	public static LigneCommandeClientDto fromEntity(LigneCommandeClient ligneCommandeClient) {
		if (ligneCommandeClient == null)
			return null;
		return LigneCommandeClientDto.builder()
				.id(ligneCommandeClient.getId())
				.article(ligneCommandeClient.getArticle())
				.commandeClient(ligneCommandeClient.getCommandeClient())
				.quantite(ligneCommandeClient.getQuantite())
				.prixUnitaire(ligneCommandeClient.getPrixUnitaire())
				.build();
	}
	public static LigneCommandeClient toEntity(LigneCommandeClientDto ligneCommandeClientDto) {
		if (ligneCommandeClientDto == null)
			return null;
		LigneCommandeClient ligneCommandeClient = new LigneCommandeClient();
		ligneCommandeClient.setId(ligneCommandeClientDto.getId());
		ligneCommandeClient.setArticle(ligneCommandeClientDto.getArticle());
		ligneCommandeClient.setCommandeClient(ligneCommandeClientDto.getCommandeClient());
		ligneCommandeClient.setQuantite(ligneCommandeClientDto.getQuantite());
		ligneCommandeClient.setPrixUnitaire(ligneCommandeClientDto.getPrixUnitaire());
		return ligneCommandeClient;
	}

}
