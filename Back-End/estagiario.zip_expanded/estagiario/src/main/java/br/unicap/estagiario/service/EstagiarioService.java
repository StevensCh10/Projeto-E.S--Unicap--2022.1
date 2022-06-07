package br.unicap.estagiario.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.unicap.estagiario.model.Estagiario;
import br.unicap.estagiario.model.Feedback;
import br.unicap.estagiario.repo.FeedbackRepo;

@Service
public class EstagiarioService {
	private final FeedbackRepo feedbackRepo;
	
	@Autowired
	public EstagiarioService(FeedbackRepo feedbackRepo) {
		this.feedbackRepo = feedbackRepo;
	}
	
	public List<Feedback> feedbacks(Estagiario estagiario){
		return feedbackRepo.findAll();
	}
}
