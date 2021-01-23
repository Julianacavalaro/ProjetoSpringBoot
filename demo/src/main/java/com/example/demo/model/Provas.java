package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="provas")
public class Provas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private String nomeProva;
	
	@OneToMany(mappedBy = "provas", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("provas")
	private List<Gabarito> gabarito;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeProva() {
		return nomeProva;
	}

	public void setNomeProva(String nomeProva) {
		this.nomeProva = nomeProva;
	}

	public List<Gabarito> getGabarito() {
		return gabarito;
	}

	public void setGabarito(List<Gabarito> gabarito) {
		this.gabarito = gabarito;
	}
	
	

	}


