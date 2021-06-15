package com.aulaspringboot.crud.interfaceservice;

import java.util.List;
import java.util.Optional;
import com.aulaspringboot.crud.model.Pessoa;

public interface PessoaInterfServ {
	public List<Pessoa> listar();
	public Optional<Pessoa> listarPeloId(int id);
	public void salvar(Pessoa p);
	public void apagar(int id);
	public Pessoa get(int id);
}
