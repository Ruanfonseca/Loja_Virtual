package com.loja.backend.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

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

    @Temporal(TemporalType.TIMESTAMP) //informando data e hora
    private Date dataCriacao;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAtualizacao;
}
