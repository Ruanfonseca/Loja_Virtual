package com.loja.backend.service;

import com.loja.backend.entities.Permissao;
import com.loja.backend.repository.PermissaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PermissaoService {

      @Autowired
      private PermissaoRepository repository;

      public List<Permissao> buscarTodos(){
          return repository.findAll();
      }

      public Permissao inserir(Permissao permissao){
          permissao.setDataCriacao(new Date());
          Permissao permissaoNovo = repository.saveAndFlush(permissao);
         return permissaoNovo;

      }

      public Permissao alterar(Permissao permissao){

          permissao.setDataAtualizacao(new Date());

          return repository.saveAndFlush(permissao);
      }

      public void excluir(Long id){

          Permissao permissao = repository.findById(id).get();
           repository.delete(permissao);

      }

}
