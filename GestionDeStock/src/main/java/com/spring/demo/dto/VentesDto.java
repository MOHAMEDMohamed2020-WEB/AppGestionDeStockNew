package com.spring.demo.dto;

import java.time.Instant;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.spring.demo.model.LigneVente;
import com.spring.demo.model.Ventes;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VentesDto {
	
	private Integer id;
	private String code;
	private Instant dateVente;
	@JsonIgnore
	private List<LigneVente> listLigneVentes;
	
	
	public static VentesDto fromEntity(Ventes ventes) {
		if (ventes == null)
			return null;
		return VentesDto.builder()
				.id(ventes.getId())
				.code(ventes.getCode())
				.dateVente(ventes.getDateVente())
				.build();
	}
	public static Ventes toEntity(VentesDto ventesDto) {
		if (ventesDto == null)
			return null;
		Ventes ventes = new Ventes();
		ventes.setId(ventesDto.getId());
		ventes.setCode(ventesDto.getCode());
		ventes.setDateVente(ventesDto.getDateVente());
		return ventes;
	}


}
