package br.edu.univille.poo2.login.core.entity;


import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;
    private String imagem;

    @OneToMany(mappedBy = "curso")
    private List<Video> videos;

    @ManyToMany(mappedBy = "cursosFavoritos")
    private List<Usuario> usuariosFavoritos;
}
