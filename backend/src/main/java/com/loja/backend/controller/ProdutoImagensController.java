package com.loja.backend.controller;

import com.loja.backend.entities.ProdutoImagens;
import com.loja.backend.service.ProdutoImagensService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/api/produtoImagens")
@CrossOrigin("http://localhost:3000")
public class ProdutoImagensController {

    @Autowired
    private ProdutoImagensService produtoImagensService;

    @GetMapping("/")
    @CrossOrigin("http://localhost:3000")
    public List<ProdutoImagens> buscarTodos(){
        return produtoImagensService.buscarTodos();
    }

    @GetMapping("/produto/{id}")
    @CrossOrigin("http://localhost:3000")
    public List<ProdutoImagens> buscarPorProduto(@PathVariable("id") Long idProduto){
        return produtoImagensService.buscarPorProduto(idProduto);
    }


    @PostMapping("/")
    @CrossOrigin("http://localhost:3000")
    public ProdutoImagens inserir(@RequestParam("idProduto") Long idProduto, @RequestParam("file") MultipartFile file){
        return produtoImagensService.inserir(idProduto,file);
    }

    @PutMapping("/")
    @CrossOrigin("http://localhost:3000")
    public ProdutoImagens alterar(@RequestBody ProdutoImagens objeto){
        return produtoImagensService.alterar(objeto);
    }

    @DeleteMapping("/{id}")
    @CrossOrigin("http://localhost:3000")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
        produtoImagensService.excluir(id);
        return ResponseEntity.ok().build();
    }

}