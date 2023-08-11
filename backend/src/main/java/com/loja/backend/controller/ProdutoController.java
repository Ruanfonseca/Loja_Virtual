package com.loja.backend.controller;

import com.loja.backend.entities.Produto;
import com.loja.backend.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/produto")
@CrossOrigin("http://localhost:3000")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/")
    @CrossOrigin("http://localhost:3000")
    public List<Produto> buscarTodos(){
        return produtoService.buscarTodos();
    }

    @GetMapping("/{id}")
    @CrossOrigin("http://localhost:3000")
    public Produto buscarPorId(@PathVariable("id") Long id){
        return produtoService.buscarPorId(id);
    }

    @PostMapping("/")
    @CrossOrigin("http://localhost:3000")
    public Produto inserir(@RequestBody Produto objeto){
        return produtoService.inserir(objeto);
    }

    @PutMapping("/")
    @CrossOrigin("http://localhost:3000")
    public Produto alterar(@RequestBody Produto objeto){
        return produtoService.alterar(objeto);
    }

    @DeleteMapping("/{id}")
    @CrossOrigin("http://localhost:3000")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
        produtoService.excluir(id);
        return ResponseEntity.ok().build();
    }

}