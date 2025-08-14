package com.javanautaherbert.cadastro_usuario.infrastructure.entitys;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.*;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "usuario")

public class Usuario { //10:23

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;


    @Column(name = "email", unique = true)
    private String email;


    @Column(name = "nome")
    private String nome;



}
