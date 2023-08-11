package com.loja.backend.dto;

import com.loja.backend.entities.Cidade;
import com.loja.backend.entities.Pessoa;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
public class PessoaClienteRequestDTO {
    private String nome;
    private String cpf;
    private String email;
    private String endereco;
    private String cep;

    private Cidade cidade;

   public Pessoa converter(PessoaClienteRequestDTO dto){
       Pessoa pessoa = new Pessoa();
       BeanUtils.copyProperties(dto,pessoa);
       return pessoa;
   }
}
