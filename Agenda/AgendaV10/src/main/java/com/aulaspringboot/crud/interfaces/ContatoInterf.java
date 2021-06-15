package com.aulaspringboot.crud.interfaces;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aulaspringboot.crud.model.Contato;

@Repository 
public interface ContatoInterf  extends JpaRepository<Contato, Integer>{

}
