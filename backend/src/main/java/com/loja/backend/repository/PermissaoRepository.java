package com.loja.backend.repository;

import com.loja.backend.entities.Permissao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PermissaoRepository extends JpaRepository<Permissao,Long> {
    List<Permissao> findByNome(String nome);
}
