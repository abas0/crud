package com.aulaspringboot.crud.interfaceservice;

import java.util.List;
import java.util.Optional;
import com.aulaspringboot.crud.model.Endereco;

public interface EnderecoInterfServ {

	
	public List<Endereco> listar();
	public Optional<Endereco> listarPeloId(int idend);
	public void salvar(Endereco e);
	public void apagar(int idend);
	public Endereco get(int idend);
	
}
