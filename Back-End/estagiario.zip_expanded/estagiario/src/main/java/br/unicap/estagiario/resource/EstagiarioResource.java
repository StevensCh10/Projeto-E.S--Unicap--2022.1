package br.unicap.estagiario.resource;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unicap.estagiario.model.Estagiario;
import br.unicap.estagiario.model.Feedback;
import br.unicap.estagiario.service.EstagiarioService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/estagiario")
public class EstagiarioResource {
	
	private final EstagiarioService estagiarioService;
	
	public EstagiarioResource(EstagiarioService estagiarioService) {
		this.estagiarioService = estagiarioService;				
	}
	
	@GetMapping
	public ResponseEntity<List<Feedback>> getFeedbacks(@RequestBody Estagiario estagiario){
		List<Feedback> feedbacks = estagiarioService.feedbacks(estagiario);
		return new ResponseEntity<>(feedbacks, HttpStatus.OK);
	}
}