package com.cursoBackend.sistema.de.vendas.Sistema.de.Vendas.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "tb_sales")
public class Vendas implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "seller_name")
    private String seller_name;
    private Integer visited;
    private Double deals;
    private Double amount;
    private Date date;

    public Vendas() {

    }
}
