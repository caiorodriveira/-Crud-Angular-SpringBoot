package com.backend.pessoas.model;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Table(name = "paises")
@Getter
@Setter
@NoArgsConstructor
public class Pais {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;
	public String nome;
	
	public Pais(String nome) {
		super();
		this.nome = nome;
	}
	

}
