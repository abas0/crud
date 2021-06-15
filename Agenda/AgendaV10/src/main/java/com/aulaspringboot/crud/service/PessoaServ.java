package com.aulaspringboot.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aulaspringboot.crud.interfaces.PessoaInterf;
import com.aulaspringboot.crud.interfaceservice.PessoaInterfServ;
import com.aulaspringboot.crud.model.Pessoa;

@Service
public class PessoaServ implements PessoaInterfServ{
	
	@Autowired
	private PessoaInterf data;

	@Override
	public List<Pessoa> listar() {
		return (List<Pessoa>)data.findAll();
	}

	@Override
	public Optional<Pessoa> listarPeloId(int id) {
		// TODO Auto-generated method stub
		return (Optional<Pessoa>)data.findById(id);
	}

	@Override
	public void salvar(Pessoa p) {
		data.save(p);
		//return 0;
	}

	@Override
	public void apagar(int id) {
		data.deleteById(id);
		
	}
	
	public Pessoa get(int id) {
        return data.getById(id);
    }
	
}
