package br.unicap.estagiario.repo;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import br.unicap.estagiario.model.Coordenador;

public interface CoordenadorRepo extends JpaRepository<Coordenador, Long>{
	Optional<Coordenador> findByCpf(String cpf);
	
	@Query("FROM Coordenador WHERE cpf= :cpf AND senha= :senha")
	public Coordenador findByLoginAndSenha(@Param("cpf") String login, @Param("senha") String senha);
}
