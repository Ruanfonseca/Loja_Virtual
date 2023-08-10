package com.loja.backend.service;

import com.loja.backend.entities.Cidade;
import com.loja.backend.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CidadeService {

      @Autowired
      private CidadeRepository repository;

      public List<Cidade> buscarTodos(){
          return repository.findAll();
      }

      public Cidade inserir(Cidade cidade){
         cidade.setDataCriacao(new Date());
         Cidade cidadeNovo = repository.saveAndFlush(cidade);
         return cidadeNovo;

      }

      public Cidade alterar(Cidade cidade){

          cidade.setDataAtualizacao(new Date());

          return repository.saveAndFlush(cidade);
      }

      public void excluir(Long id){

          Cidade cidade = repository.findById(id).get();
           repository.delete(cidade);

      }

}
