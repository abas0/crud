package com.aulaspringboot.crud.interfaceservice;

import java.util.List;
import java.util.Optional;
import com.aulaspringboot.crud.model.Contato;

public interface ContatoInterfServ {
	public List<Contato> listar();
	public Optional<Contato> listarPeloId(int idcont);
	public void salvar(Contato c);
	public void apagar(int idcont);
	public Contato get(int idcont);
}
