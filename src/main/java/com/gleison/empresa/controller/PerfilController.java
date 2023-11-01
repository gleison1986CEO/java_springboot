package com.gleison.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gleison.empresa.models.Perfil;
import com.gleison.empresa.service.PerfilService;

@RestController
public class PerfilController {
	
	@Autowired
	private PerfilService perfilService;
	
	@PostMapping("/insert")
	public ResponseEntity<?> insert(@RequestBody Perfil perfil){
		return new ResponseEntity<Perfil>(perfilService.insert(perfil), HttpStatus.CREATED);
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<?> getPerfil(@PathVariable Integer id){
		return new ResponseEntity<Perfil>(perfilService.getPerfil(id),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable Integer id){
		return new ResponseEntity<String>(perfilService.delete(id),HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<?> update(@RequestBody Perfil person){
		return new ResponseEntity<Perfil>(perfilService.update(person),HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public ResponseEntity<?> allPerfil(){
		return new ResponseEntity<List<Perfil>>(perfilService.getAllPerfil(),HttpStatus.OK);
	}
}
