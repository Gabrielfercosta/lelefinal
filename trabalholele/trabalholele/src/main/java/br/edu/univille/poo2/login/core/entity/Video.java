package br.edu.univille.poo2.login.core.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descricao;
    private String url;

    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Curso curso;
}
