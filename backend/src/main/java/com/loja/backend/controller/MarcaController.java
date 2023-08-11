package com.loja.backend.controller;

import com.loja.backend.entities.Marca;
import com.loja.backend.service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/marca")
@CrossOrigin("http://localhost:3000")
public class MarcaController {

     @Autowired
     private MarcaService marcaService;

     @GetMapping("/")
     @CrossOrigin("http://localhost:3000")
     public List<Marca>buscarTodos(){
         return marcaService.buscarTodos();
    }

     @PostMapping("/")
     @CrossOrigin("http://localhost:3000")
     public Marca inserir(@RequestBody  Marca marca){
       return marcaService.inserir(marca);
     }

     @PutMapping("/")
     @CrossOrigin("http://localhost:3000")
     public Marca alterar(@RequestBody Marca marca){
        return marcaService.alterar(marca);
     }

     @DeleteMapping("/{id}")
     @CrossOrigin("http://localhost:3000")
     public ResponseEntity<Void>excluir(@PathVariable("id") Long id ){

         marcaService.excluir(id);

         return ResponseEntity.ok().build();
    }

}
