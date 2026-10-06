package com.projeto.banco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name="tb_Cliente")
@Getter
@NoArgsConstructor
class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false, unique = true)
    private String documento;
    @Column(nullable = false, unique = true)
    private String email;
    protected Cliente(String nome, String documento, String email) {
        this.nome = nome;
        this.documento = documento;
        this.email = email;
    }
    
}