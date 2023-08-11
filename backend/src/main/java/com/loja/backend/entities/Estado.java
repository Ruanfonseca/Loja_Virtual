package com.loja.backend.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="estado")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Estado {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO) //automaticamente
     private Long id;


     private String nome;
     private String sigla;

     @Temporal(TemporalType.TIMESTAMP) //informando data e hora
     private Date dataCriacao;

     @Temporal(TemporalType.TIMESTAMP)
     private Date dataAtualizacao;


}
