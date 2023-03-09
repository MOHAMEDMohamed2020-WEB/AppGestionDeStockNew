package com.spring.demo.dto;

import com.spring.demo.model.Role;
import com.spring.demo.model.Utilisiateur;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RoleDto {

	private Integer id;
	private String code;
	private Utilisiateur utilisateur;
	
	public static RoleDto fromEntity(Role role) {
		if (role == null)
			return null;
		return RoleDto.builder()
				.id(role.getId())
				.code(role.getCode())
				.utilisateur(role.getUtilisateur())
				.build();
	}
	public static Role toEntity(RoleDto roleDto) {
		if (roleDto == null)
			return null;
		Role role = new Role();
		role.setId(roleDto.getId());
		role.setCode(roleDto.getCode());
		role.setUtilisateur(roleDto.getUtilisateur());
		return role;
	}


}
