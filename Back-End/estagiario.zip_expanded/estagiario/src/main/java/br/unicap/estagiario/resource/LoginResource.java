package br.unicap.estagiario.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.unicap.estagiario.model.Coordenador;
import br.unicap.estagiario.model.Estagiario;
import br.unicap.estagiario.service.LoginService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/login")
public class LoginResource {
	
	private final LoginService loginService;
	
	public LoginResource(LoginService loginService) {
		this.loginService = loginService;
	}
	
	@GetMapping("/{login}/{password}")
	public ResponseEntity<?> verificarLogin(@PathVariable String login, @PathVariable String password) {
		Estagiario estagiario = loginService.loginEstagiario(login, password);
		Coordenador coordenador = loginService.loginCoordenador(login, password);
		
		if(estagiario == null && coordenador == null) {
			return new ResponseEntity<>(null, HttpStatus.OK);
		} else {
			if(estagiario == null) {
				return new ResponseEntity<>(coordenador, HttpStatus.OK);
			}else {
				return new ResponseEntity<>(estagiario, HttpStatus.OK);
			}
		}
	}
}