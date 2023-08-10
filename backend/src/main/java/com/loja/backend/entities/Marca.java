package com.loja.backend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="marca")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //automaticamente
    private Long id;

    private String nome;

    @Temporal(TemporalType.TIMESTAMP) //informando data e hora
    private Date dataCriacao;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAtualizacao;


}
