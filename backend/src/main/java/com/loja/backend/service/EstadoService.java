package com.loja.backend.service;

import com.loja.backend.entities.Estado;
import com.loja.backend.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EstadoService {

      @Autowired
      private EstadoRepository repository;

      public List<Estado> buscarTodos(){
          return repository.findAll();
      }

      public Estado inserir(Estado estado){
         estado.setDataCriacao(new Date());
         Estado estadoNovo = repository.saveAndFlush(estado);
         return estadoNovo;

      }

      public Estado alterar(Estado estado){

          estado.setDataAtualizacao(new Date());

          return repository.saveAndFlush(estado);
      }

      public void excluir(Long id){

          Estado estado = repository.findById(id).get();
       repository.delete(estado);

      }

}
