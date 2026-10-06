package com.projeto.banco.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;

import jakarta.persistence.Id;

    @Entity(name="tb_Conta")
    @Getter
    @NoArgsConstructor
    class Conta {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(nullable = false, unique = true)
        private String numero;
        @Column(nullable = false)
        private Double saldo = 0.0;
        @Column(nullable = false, unique = true)
        private String agencia;
        @Column(nullable = false)
        private String tipo;
        
        @ManyToOne
        @JoinColumn(name="cliente_id", nullable=false)
        private Cliente cliente;
        
        protected Conta(String numero, Double saldo, Cliente cliente) {
            this.numero = numero;
            this.saldo = saldo;
            this.agencia = agencia;
            this.tipo = tipo;
            this.cliente = cliente;
        }
    }
    

