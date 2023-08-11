package com.loja.backend.controller;

import com.loja.backend.dto.PessoaClienteRequestDTO;
import com.loja.backend.entities.Pessoa;
import com.loja.backend.service.PessoaClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cliente")
@CrossOrigin("http://localhost:3000")
public class PessoaClienteController {

    @Autowired
    private PessoaClienteService pessoaService;

    @PostMapping("/")
    @CrossOrigin("http://localhost:3000")
    public Pessoa inserir(@RequestBody PessoaClienteRequestDTO pessoaClienteRequestDTO){

        return pessoaService.registrar(pessoaClienteRequestDTO);

    }

}