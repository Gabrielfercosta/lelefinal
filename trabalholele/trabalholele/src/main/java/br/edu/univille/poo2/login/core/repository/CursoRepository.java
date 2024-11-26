package br.edu.univille.poo2.login.core.repository;

import br.edu.univille.poo2.login.core.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
    // Métodos de consulta personalizados, se necessário
}
