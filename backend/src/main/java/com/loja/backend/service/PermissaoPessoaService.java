package com.loja.backend.service;

import com.loja.backend.entities.Permissao;
import com.loja.backend.entities.PermissaoPessoa;
import com.loja.backend.entities.Pessoa;
import com.loja.backend.repository.PermissaoPessoaRepository;
import com.loja.backend.repository.PermissaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PermissaoPessoaService {

    @Autowired
    private PermissaoPessoaRepository permissaoPessoaRepository;

    @Autowired
    private PermissaoRepository permissaoRepository;


    public void vincularPessoaPermissaoCliente(Pessoa pessoa){
        List<Permissao> listaPermissao = permissaoRepository.findByNome("cliente");

        if(listaPermissao.size() > 0){

            PermissaoPessoa permissaoPessoa = new PermissaoPessoa();
            permissaoPessoa.setPessoa(pessoa);
            permissaoPessoa.setPermissao(listaPermissao.get(0));
            permissaoPessoa.setDataCriacao(new Date());

            permissaoPessoaRepository.saveAndFlush(permissaoPessoa);
        }
    }

}
