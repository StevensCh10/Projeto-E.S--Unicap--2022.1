package br.unicap.estagiario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unicap.estagiario.model.Feedback;
import br.unicap.estagiario.repo.FeedbackRepo;

@Service
public class FeedbackService {
	private final FeedbackRepo feedbackRepo;
	
	@Autowired
	public FeedbackService(FeedbackRepo feedbackRepo) {
		this.feedbackRepo = feedbackRepo;
	}
	
	public Feedback adicionarFeedback(Feedback feedback) {
		return feedbackRepo.save(feedback);
	}
	
	public Feedback atualizarFeedback(Feedback feedback) {
		return feedbackRepo.save(feedback);
	}
	
	public void deletarFeedback(Feedback feedback) {
		feedbackRepo.delete(feedback);
	}
}