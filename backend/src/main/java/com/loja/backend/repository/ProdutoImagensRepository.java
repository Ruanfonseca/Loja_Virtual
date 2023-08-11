package com.loja.backend.repository;

import com.loja.backend.entities.ProdutoImagens;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoImagensRepository extends JpaRepository<ProdutoImagens,Long> {
    public List<ProdutoImagens> findByProdutoId(Long id);
}
