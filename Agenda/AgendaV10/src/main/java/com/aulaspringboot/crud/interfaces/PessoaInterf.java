package com.aulaspringboot.crud.interfaces;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.aulaspringboot.crud.model.Pessoa;

import java.util.List;

@Repository

public interface PessoaInterf extends JpaRepository<Pessoa, Integer>{
    @Query("select p from Pessoa p where p.nome like %?1%")
    List<Pessoa> findByNome(String nome);


}
