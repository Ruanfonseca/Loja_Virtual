package com.loja.backend.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="produto")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //automaticamente
    private Long id;

    private String descricaoCurta;
    private String descricaoDetalhada;
    private String valorCusto;
    private String valorVenda;

    @ManyToOne
    @JoinColumn(name = "idMarca")
    private Marca marca;

    @ManyToOne
    @JoinColumn(name="idCategoria")
    private Categoria categoria;


    @Temporal(TemporalType.TIMESTAMP) //informando data e hora
    private Date dataCriacao;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAtualizacao;

}
