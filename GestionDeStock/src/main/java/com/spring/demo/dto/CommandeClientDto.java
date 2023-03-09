package com.spring.demo.dto;

import java.time.Instant;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.spring.demo.model.Client;
import com.spring.demo.model.CommandeClient;
import com.spring.demo.model.LigneCommandeClient;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommandeClientDto {

	private Integer id;
	private String code;
	private Instant dateCommande;
	private Client client;
	@JsonIgnore
	private List<LigneCommandeClient> listLigneCommandeClient;
	
	public static CommandeClientDto fromEntity(CommandeClient commandeClient) {
		if (commandeClient == null)
			return null;
		return CommandeClientDto.builder()
				.id(commandeClient.getId())
				.code(commandeClient.getCode())
				.dateCommande(commandeClient.getDateCommande())
				.client(commandeClient.getClient())
				.build();
	}
	public static CommandeClient toEntity(CommandeClientDto commandeClientDto) {
		if (commandeClientDto == null)
			return null;
		CommandeClient commandeClient = new CommandeClient();
		commandeClient.setId(commandeClientDto.getId());
		commandeClient.setCode(commandeClientDto.getCode());
		commandeClient.setDateCommande(commandeClientDto.getDateCommande());
		commandeClient.setClient(commandeClientDto.getClient());
		return commandeClient;
	}

}
