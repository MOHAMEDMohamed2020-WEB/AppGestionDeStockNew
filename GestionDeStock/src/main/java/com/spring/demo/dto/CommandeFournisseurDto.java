package com.spring.demo.dto;

import java.time.Instant;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.spring.demo.model.CommandeFournisseur;
import com.spring.demo.model.Fournisseur;
import com.spring.demo.model.LigneCommandeFournisseur;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommandeFournisseurDto {

	private Integer id;
	private String code;
	private Instant dateCommande;
	private Fournisseur fournisseur;
	@JsonIgnore
	private List<LigneCommandeFournisseur> listLigneCommandeFournisseur;
	
	public static CommandeFournisseurDto fromEntity(CommandeFournisseur commandeFournisseur) {
		if (commandeFournisseur == null)
			return null;
		return CommandeFournisseurDto.builder()
				.id(commandeFournisseur.getId())
				.code(commandeFournisseur.getCode())
				.dateCommande(commandeFournisseur.getDateCommande())
				.fournisseur(commandeFournisseur.getFournisseur())
				.build();
	}
	public static CommandeFournisseur toEntity(CommandeFournisseurDto commandeFournisseurDto) {
		if (commandeFournisseurDto == null)
			return null;
		CommandeFournisseur commandeFournisseur = new CommandeFournisseur();
		commandeFournisseur.setId(commandeFournisseurDto.getId());
		commandeFournisseur.setCode(commandeFournisseurDto.getCode());
		commandeFournisseur.setDateCommande(commandeFournisseurDto.getDateCommande());
		commandeFournisseur.setFournisseur(commandeFournisseurDto.getFournisseur());
		return commandeFournisseur;
	}


}
