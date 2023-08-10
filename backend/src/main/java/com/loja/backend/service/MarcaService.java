package com.loja.backend.service;

import com.loja.backend.entities.Marca;
import com.loja.backend.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class MarcaService {

      @Autowired
      private MarcaRepository repository;

      public List<Marca> buscarTodos(){
          return repository.findAll();
      }

      public Marca inserir(Marca marca){
          marca.setDataCriacao(new Date());
          Marca marcaNovo = repository.saveAndFlush(marca);
         return marcaNovo;

      }

      public Marca alterar(Marca marca){

          marca.setDataAtualizacao(new Date());

          return repository.saveAndFlush(marca);
      }

      public void excluir(Long id){

          Marca marca = repository.findById(id).get();
           repository.delete(marca);

      }

}
