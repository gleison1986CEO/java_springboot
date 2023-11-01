package com.gleison.empresa.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vaga {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String cargo;

	private String equipe;

	private String horas;
	

}
