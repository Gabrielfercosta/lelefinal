package br.edu.univille.poo2.login.core.repository;

import br.edu.univille.poo2.login.core.entity.Certificado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CertificadoRepository extends JpaRepository<Certificado, Long> {
    // Métodos de consulta personalizados, se necessário
}
