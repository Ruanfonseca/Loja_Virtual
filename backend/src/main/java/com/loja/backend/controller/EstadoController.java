package com.loja.backend.controller;

import com.loja.backend.entities.Estado;
import com.loja.backend.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estado")
@CrossOrigin("http://localhost:3000")
public class EstadoController {

     @Autowired
     private EstadoService estadoService;

     @GetMapping("/")
     @CrossOrigin("http://localhost:3000")
     public List<Estado>buscarTodos(){
         return estadoService.buscarTodos();
    }

     @PostMapping("/")
     @CrossOrigin("http://localhost:3000")
     public Estado inserir(@RequestBody  Estado estado){
       return estadoService.inserir(estado);
     }

     @PutMapping("/")
     @CrossOrigin("http://localhost:3000")
     public Estado alterar(@RequestBody Estado estado){
        return estadoService.alterar(estado);
     }

     @DeleteMapping("/{id}")
     @CrossOrigin("http://localhost:3000")
     public ResponseEntity<Void>excluir(@PathVariable("id") Long id ){

         estadoService.excluir(id);

         return ResponseEntity.ok().build();
    }

}
