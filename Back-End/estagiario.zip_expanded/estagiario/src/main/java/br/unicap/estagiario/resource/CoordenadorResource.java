package br.unicap.estagiario.resource;

import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unicap.estagiario.model.Coordenador;
import br.unicap.estagiario.model.Estagiario;
import br.unicap.estagiario.model.Feedback;
import br.unicap.estagiario.service.CoordenadorService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/coordenador")
public class CoordenadorResource {
	private final CoordenadorService coordenadorService;
	
	public CoordenadorResource(CoordenadorService coordenadorService) {
		this.coordenadorService = coordenadorService;
	}
	
	@PostMapping("/addCoordenador")
	public ResponseEntity<Coordenador> addCoordenador(@RequestBody Coordenador coordenador){
		Coordenador newCoordenador = coordenadorService.adicionarCoordenador(coordenador);
		return new ResponseEntity<>(newCoordenador, HttpStatus.CREATED);
	}
	
	@PostMapping("/addEstagiario")
	public ResponseEntity<Estagiario> addEstagiario(@RequestBody Estagiario estagiario){
		Estagiario newEstagiario = coordenadorService.adicionarEstagiario(estagiario);
		return new ResponseEntity<>(newEstagiario, HttpStatus.CREATED);
	}
	
	@PostMapping("/addFeedback")
	public ResponseEntity<Feedback> addFeedback(@RequestBody Feedback feedback){
		Feedback newFeedback = coordenadorService.postarFeedback(feedback);
		return new ResponseEntity<>(newFeedback, HttpStatus.CREATED);
	}
	
	@PutMapping("/atualizarCoordenador")
	public ResponseEntity<Coordenador> atualizarCoordenador(@RequestBody Coordenador coordenador){
		Coordenador newCoordenador = coordenadorService.adicionarCoordenador(coordenador);
		return new ResponseEntity<>(newCoordenador, HttpStatus.OK);
	}
	
	@PutMapping("/atualizarEstagiario")
	public ResponseEntity<Estagiario> atualizarEstagiario(@RequestBody Estagiario estagiario){
		Estagiario newEstagiario = coordenadorService.adicionarEstagiario(estagiario);
		return new ResponseEntity<>(newEstagiario, HttpStatus.OK);
	}
	
	@PutMapping("/atualizarFeedback")
	public ResponseEntity<Feedback> atualizarFeedback(@RequestBody Feedback feedback){
		Feedback newFeedback = coordenadorService.postarFeedback(feedback);
		return new ResponseEntity<>(newFeedback, HttpStatus.OK);
	}
	
	/*
	@GetMapping("/findCoordenador")
	public ResponseEntity<Optional<Coordenador>> getCoordenador(@RequestBody Coordenador coordenador){
		Optional<Coordenador> newCoordenador = coordenadorService.procurarCoordenador(coordenador);
		return new ResponseEntity<>(newCoordenador, HttpStatus.OK);
	} */
	
	@GetMapping("/findCoordenador/{id}")
	public ResponseEntity<Optional<Coordenador>> getCoordenador(@PathVariable Long id){
		Optional<Coordenador> newCoordenador = coordenadorService.procurarCoordenador(id);
		return new ResponseEntity<>(newCoordenador, HttpStatus.OK);
	}
	
	@GetMapping("/findCoordenadorByCpf/{cpf}")
	public ResponseEntity<Optional<Coordenador>> getCoordenadorByCpf(@PathVariable String cpf){
		Optional<Coordenador> newCoordenador = coordenadorService.procurarCoordenadorByCpf(cpf);
		return new ResponseEntity<>(newCoordenador, HttpStatus.OK);
	}
	
	@GetMapping("/findFeedback")
	public ResponseEntity<List<Feedback>> getFeedback(@RequestBody Coordenador coordenador){
		List<Feedback> feedbacks = coordenadorService.feedbacks(coordenador);
		return new ResponseEntity<>(feedbacks, HttpStatus.OK);
	}
	
	@DeleteMapping("/deletarCoordenador/{id}")
	public ResponseEntity<Coordenador> deletarCoordenador(@PathVariable Long id){
		coordenadorService.deletarCoordenador(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("/deletarEstagiario")
	public ResponseEntity<Estagiario> deletarEstagiario(@RequestBody Estagiario estagiario){
		coordenadorService.deletarEstagiario(estagiario);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("/deletarFeedback")
	public ResponseEntity<Feedback> deletarFeedback(@RequestBody Feedback feedback){
		coordenadorService.deletarFeedback(feedback);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
