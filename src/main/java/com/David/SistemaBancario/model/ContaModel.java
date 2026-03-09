package com.David.SistemaBancario.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tb_conta")
public class ContaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String numero;

    @Column
    private BigDecimal saldo;

    @Column
    private String tipo;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private ClienteModel cliente;
}
