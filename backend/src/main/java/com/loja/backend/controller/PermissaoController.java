package com.loja.backend.controller;

import com.loja.backend.entities.Permissao;
import com.loja.backend.service.PermissaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/permissao")
@CrossOrigin("http://localhost:3000")
public class PermissaoController {

    @Autowired
    private PermissaoService permissaoService;

    @GetMapping("/")
    @CrossOrigin("http://localhost:3000")
    public List<Permissao> buscarTodos(){
        return permissaoService.buscarTodos();
    }

    @PostMapping("/")
    @CrossOrigin("http://localhost:3000")
    public Permissao inserir(@RequestBody Permissao objeto){
        return permissaoService.inserir(objeto);
    }

    @PutMapping("/")
    @CrossOrigin("http://localhost:3000")
    public Permissao alterar(@RequestBody Permissao objeto){
        return permissaoService.alterar(objeto);
    }

    @DeleteMapping("/{id}")
    @CrossOrigin("http://localhost:3000")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
        permissaoService.excluir(id);
        return ResponseEntity.ok().build();
    }

}