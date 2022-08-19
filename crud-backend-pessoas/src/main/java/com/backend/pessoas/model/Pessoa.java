package com.backend.pessoas.model;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "pessoas")
@Getter
@Setter
@NoArgsConstructor
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private String sobrenome;
	private String idade;
	
	@ManyToOne
	@JoinColumn(name="id_pais")
	private Pais pais;
	
	@ManyToOne
	@JoinColumn(name="id_estado")
	private Estado estado;
	
	
	public Pessoa(String nome, String sobrenome, String idade, Pais pais, Estado estado) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.pais = pais;
		this.estado = estado;
	}
}
