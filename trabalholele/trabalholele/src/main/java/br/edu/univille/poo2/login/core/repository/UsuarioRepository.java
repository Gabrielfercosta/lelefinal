package br.edu.univille.poo2.login.core.repository;

import br.edu.univille.poo2.login.core.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Aqui você pode adicionar métodos de consulta personalizados, se necessário
}
