package com.loja.backend.entities;


import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="pessoa")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //automaticamente
    private Long id;

    private String nome;
    private String cpf;
    private String email;
    private String senha;
    private String endereco;
    private String cep;


    @ManyToOne
    @JoinColumn(name="idCidade")
    private Cidade cidade;

    private String codigoRecuperacaoSenha;

    @Temporal(TemporalType.TIMESTAMP)
    private Date DataEnvioCodigo;

    @OneToMany(mappedBy = "pessoa",orphanRemoval = true, //se estiver faltando algum dado nessa lista , com o orphan = true , spring remove automaticamente
            cascade = {CascadeType.PERSIST,CascadeType.MERGE}) //do banco e atualiza
    @Setter(value = AccessLevel.NONE) //desativando o setter do lombok
    private List<PermissaoPessoa>permissaoPessoas;

    @Temporal(TemporalType.TIMESTAMP) //informando data e hora
    private Date dataCriacao;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAtualizacao;


 public void setPermissaoPessoas(List<PermissaoPessoa>pp){

     for(PermissaoPessoa p:pp){
          p.setPessoa(this);
     }
    this.permissaoPessoas = pp;
 }

}
