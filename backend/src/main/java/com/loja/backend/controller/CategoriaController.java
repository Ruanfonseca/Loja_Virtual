package com.loja.backend.controller;

import com.loja.backend.entities.Categoria;
import com.loja.backend.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categoria")
@CrossOrigin("http://localhost:3000")
public class CategoriaController {

     @Autowired
     private CategoriaService categoriaService;

     @GetMapping("/")
     @CrossOrigin("http://localhost:3000")
     public List<Categoria>buscarTodos(){
         return categoriaService.buscarTodos();
    }

     @PostMapping("/")
     @CrossOrigin("http://localhost:3000")
     public Categoria inserir(@RequestBody  Categoria categoria){
       return categoriaService.inserir(categoria);
     }

     @PutMapping("/")
     @CrossOrigin("http://localhost:3000")
     public Categoria alterar(@RequestBody Categoria categoria){
        return categoriaService.alterar(categoria);
     }

     @DeleteMapping("/{id}")
     @CrossOrigin("http://localhost:3000")
     public ResponseEntity<Void>excluir(@PathVariable("id") Long id ){

         categoriaService.excluir(id);

         return ResponseEntity.ok().build();
    }

}
