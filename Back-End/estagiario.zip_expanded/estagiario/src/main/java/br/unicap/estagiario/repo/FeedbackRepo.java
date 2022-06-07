package br.unicap.estagiario.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import br.unicap.estagiario.model.Feedback;

public interface FeedbackRepo extends JpaRepository<Feedback, Long>{
	
}
