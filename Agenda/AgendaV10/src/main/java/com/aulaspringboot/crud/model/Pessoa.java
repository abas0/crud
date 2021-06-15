package com.aulaspringboot.crud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="pessoa")

public class Pessoa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String sexo;
	private String estadocivil;
	
	@ManyToOne
	@JoinColumn(name="end_id")
	private Endereco endereco;
	
	@ManyToOne
	@JoinColumn (name = "cont_id")
	private Contato contato;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEstadocivil() {
		return estadocivil;
	}
	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}
	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pessoa(int id, String nome, String sexo, String estadocivil, Endereco endereco, Contato contato) {
		super();
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
		this.estadocivil = estadocivil;
		this.endereco = endereco;
		this.contato = contato;
	}
	


}
