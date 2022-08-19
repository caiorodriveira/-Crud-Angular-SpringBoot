package com.backend.pessoas.model;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Table(name = "estados")
@Getter
@Setter
@NoArgsConstructor
public class Estado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;
	
	@ManyToOne
	@JoinColumn(name = "id_pais")
	public Pais pais;
	
	public String nome;
	
	public Estado(Pais pais, String nome) {
		super();
		this.pais = pais;
		this.nome = nome;
	}
}
