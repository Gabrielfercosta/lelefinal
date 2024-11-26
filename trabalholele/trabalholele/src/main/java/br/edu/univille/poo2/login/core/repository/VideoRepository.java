package br.edu.univille.poo2.login.core.repository;

import br.edu.univille.poo2.login.core.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Long> {
    // Métodos de consulta personalizados, se necessário
}
