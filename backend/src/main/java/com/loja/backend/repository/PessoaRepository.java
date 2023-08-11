package com.loja.backend.repository;

import com.loja.backend.entities.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa,Long> {

    Pessoa findByEmail(String Email);

    Pessoa findByEmailAndCodigoRecuperacaoSenha(String email,String codigoRecuperacaoSenha);

}
