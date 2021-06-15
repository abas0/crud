package com.aulaspringboot.crud.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aulaspringboot.crud.interfaces.EnderecoInterf;
import com.aulaspringboot.crud.interfaceservice.EnderecoInterfServ;
import com.aulaspringboot.crud.model.Endereco;



@Service 
public class EnderecoServ implements EnderecoInterfServ{
	
	@Autowired
	private EnderecoInterf data;

	@Override
	public List<Endereco> listar() {
		return (List<Endereco>)data.findAll();
	}

	@Override
	public Optional<Endereco> listarPeloId(int idend) {
		return (Optional<Endereco>)data.findById(idend);
	}

	@Override
	public void salvar(Endereco e) {
		data.save(e);
		//return 0;
	}

	@Override
	public void apagar(int idend) {
		data.deleteById(idend);
		
	}
	
	public Endereco get(int idend) {
        return data.getById(idend);
    }
	
}
