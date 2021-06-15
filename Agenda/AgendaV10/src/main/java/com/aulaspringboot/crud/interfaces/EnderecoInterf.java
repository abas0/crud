package com.aulaspringboot.crud.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.aulaspringboot.crud.model.Endereco;



	@Repository
	public interface EnderecoInterf extends JpaRepository<Endereco, Integer>{
		
	}

	
	

