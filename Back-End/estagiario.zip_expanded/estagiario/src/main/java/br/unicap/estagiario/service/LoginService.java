package br.unicap.estagiario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unicap.estagiario.model.Coordenador;
import br.unicap.estagiario.model.Estagiario;
import br.unicap.estagiario.repo.CoordenadorRepo;
import br.unicap.estagiario.repo.EstagiarioRepo;

@Service
public class LoginService {
	
	private final CoordenadorRepo coordenadorRepo;
	private final EstagiarioRepo estagiarioRepo;
	
	@Autowired
	public LoginService(CoordenadorRepo coordenadorRepo, EstagiarioRepo estagiarioRepo) {
		this.coordenadorRepo = coordenadorRepo;
		this.estagiarioRepo = estagiarioRepo;
	}
	
	public Estagiario loginEstagiario(String login, String password) {
		return estagiarioRepo.findByLoginAndSenha(login, password);
	}
	
	public Coordenador loginCoordenador(String login, String password) {
		return coordenadorRepo.findByLoginAndSenha(login, password);
	}
}
