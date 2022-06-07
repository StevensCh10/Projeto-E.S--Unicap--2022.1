package br.unicap.estagiario.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unicap.estagiario.model.Coordenador;
import br.unicap.estagiario.model.Estagiario;
import br.unicap.estagiario.model.Feedback;
import br.unicap.estagiario.repo.CoordenadorRepo;
import br.unicap.estagiario.repo.EstagiarioRepo;
import br.unicap.estagiario.repo.FeedbackRepo;

@Service
public class CoordenadorService {
	private final CoordenadorRepo coordenadorRepo;
	private final EstagiarioRepo estagiarioRepo;
	private final FeedbackRepo feedbackRepo;
	
	@Autowired
	public CoordenadorService(CoordenadorRepo coordenadorRepo, EstagiarioRepo estagiarioRepo, FeedbackRepo feedbackRepo) {
		this.coordenadorRepo = coordenadorRepo;
		this.estagiarioRepo = estagiarioRepo;
		this.feedbackRepo = feedbackRepo;
	}
	
	public Coordenador login(String login, String password) {
		return coordenadorRepo.findByLoginAndSenha(login, password);
	}
	
	public Coordenador adicionarCoordenador(Coordenador coordenador) {
		return coordenadorRepo.save(coordenador);
	}
	
	public Coordenador atualizarCoordenador(Coordenador coordenador) {
		return coordenadorRepo.save(coordenador);
	}
	
	public Optional<Coordenador> procurarCoordenador(Long id) {
		return coordenadorRepo.findById(id);
	}
	
	public Optional<Coordenador> procurarCoordenadorByCpf(String name) {
		return coordenadorRepo.findByCpf(name);
	}
	
	public void deletarCoordenador(Long id) {
		coordenadorRepo.deleteById(id);
	}
	
	public Feedback postarFeedback(Feedback feedback) {
		return feedbackRepo.save(feedback);
	}
	
	public Feedback AtualizarFeedback(Feedback feedback) {
		return feedbackRepo.save(feedback);
	}

	public List<Feedback> feedbacks(Coordenador coordenador){
		return feedbackRepo.findAll();
	}
	
	public void deletarFeedback(Feedback feedback) {
		feedbackRepo.delete(feedback);
	}
	
	public Estagiario adicionarEstagiario(Estagiario estagiario) {
		return estagiarioRepo.save(estagiario);
	}
	
	public Estagiario atualizarEstagiario(Estagiario estagiario) {
		return estagiarioRepo.save(estagiario);
	}
	
	/*
	public Optional<Estagiario> procurarEstagiario(Estagiario estagiario) {
		return estagiarioRepo.findById(estagiario.getId());
	} 
	*/
	
	public void deletarEstagiario(Estagiario estagiario) {
		estagiarioRepo.delete(estagiario);
	}
}