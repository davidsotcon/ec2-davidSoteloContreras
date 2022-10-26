package EC2DavidSotelo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import EC2DavidSotelo.dto.UsuarioDTORequest;
import EC2DavidSotelo.dto.UsuarioDTOResponse;
import EC2DavidSotelo.security.TokenUtil;
import EC2DavidSotelo.security.UserDetailsService;

@RestController
public class UsuarioController {

	@Autowired
	private TokenUtil util;
	
	@Autowired
	private UserDetailsService service;
	
	@RequestMapping(path = "/creartoken",method = RequestMethod.POST)
	private ResponseEntity<?>crearToken(@RequestBody UsuarioDTORequest request){
		UserDetails user = service.loadUserByUsername(request.getUsuario());
		if(user.getPassword().equals(request.getContraseña()))
			return ResponseEntity.ok(new UsuarioDTOResponse(util.generateToken(user.getUsername())));
		else 
			throw new UsernameNotFoundException("contraseña incorrecta");
	}
}
