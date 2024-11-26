package br.edu.univille.poo2.login.core.entity;


import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
public class Certificado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dataEmissao;
    private String nomeCurso;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}
