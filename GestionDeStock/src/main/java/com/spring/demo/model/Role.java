package com.spring.demo.model;



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

public class Role extends AbstractEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column
	private String code;
	
	@ManyToOne
	private Utilisiateur utilisateur;
	@Column
	private Integer idEntrepise;
}
