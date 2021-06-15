package com.aulaspringboot.crud.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="contato")

public class Contato {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idcont;
	private String email;
	private String celular;
	private String telefonefixo;
	
	@OneToMany(mappedBy="contato",cascade = {CascadeType.ALL})
	private List<Pessoa> pessoa;

	public int getIdcont() {
		return idcont;
	}

	public void setIdcont(int idcont) {
		this.idcont = idcont;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getTelefonefixo() {
		return telefonefixo;
	}

	public void setTelefonefixo(String telefonefixo) {
		this.telefonefixo = telefonefixo;
	}

	public List<Pessoa> getPessoa() {
		return pessoa;
	}

	public void setPessoa(List<Pessoa> pessoa) {
		this.pessoa = pessoa;
	}

	public Contato(int idcont, String email, String celular, String telefonefixo, List<Pessoa> pessoa) {
		super();
		this.idcont = idcont;
		this.email = email;
		this.celular = celular;
		this.telefonefixo = telefonefixo;
		this.pessoa = pessoa;
	}

	public Contato() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

