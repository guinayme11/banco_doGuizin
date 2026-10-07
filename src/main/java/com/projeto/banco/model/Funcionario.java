package com.projeto.banco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity (name="tb_Funcionario")
@Getter
@NoArgsConstructor
class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false, unique = true)
    private String documento;
    @Column(nullable = false, unique = true)
    private String email;
    @Column (nullable = false, unique = true)
    private String cargo;

    protected Funcionario(String nome, String documento, String email, String cargo) {
        this.nome = nome;
        this.documento = documento;
        this.email = email;
        this.cargo = cargo;
    }
}