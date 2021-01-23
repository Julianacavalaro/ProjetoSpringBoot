package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//Essa classe é uma entidade do jpa hibernate
@Entity

//Tabela
@Table(name = "gabarito")
public class Gabarito {

	@Id
	//Transformar o atributo em uma chave primária
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	@JsonIgnoreProperties("gabarito")
	private Provas provas;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Provas getProvas() {
		return provas;
	}

	public void setProvas(Provas provas) {
		this.provas = provas;
	}
}
	
	
	

