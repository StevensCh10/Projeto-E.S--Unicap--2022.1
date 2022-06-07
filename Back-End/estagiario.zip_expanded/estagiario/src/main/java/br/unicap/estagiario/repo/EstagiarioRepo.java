package br.unicap.estagiario.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import br.unicap.estagiario.model.Estagiario;

public interface EstagiarioRepo extends JpaRepository<Estagiario, Long>{
	
	@Query("FROM Estagiario WHERE cpf= :cpf AND senha= :senha")
	public Estagiario findByLoginAndSenha(@Param("cpf") String login, @Param("senha") String senha);
}
