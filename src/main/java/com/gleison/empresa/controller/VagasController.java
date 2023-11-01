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

import com.gleison.empresa.models.Vaga;
import com.gleison.empresa.service.VagaService;

@RestController
public class VagasController {
	
	@Autowired
	private VagaService vagaService;
	
	@PostMapping("vagas/insert")
	public ResponseEntity<?> insert(@RequestBody Vaga vaga){
		return new ResponseEntity<Vaga>(vagaService.insert(vaga), HttpStatus.CREATED);
	}

	@GetMapping("vagas/get/{id}")
	public ResponseEntity<?> getPerson(@PathVariable Integer id){
		return new ResponseEntity<Vaga>(vagaService.getVaga(id),HttpStatus.OK);
	}
	
	@DeleteMapping("vagas/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable Integer id){
		return new ResponseEntity<String>(vagaService.delete(id),HttpStatus.OK);
	}
	
	@PutMapping("vagas/update")
	public ResponseEntity<?> update(@RequestBody Vaga vaga){
		return new ResponseEntity<Vaga>(vagaService.update(vaga),HttpStatus.OK);
	}
	
	@GetMapping("vagas/all")
	public ResponseEntity<?> allVaga(){
		return new ResponseEntity<List<Vaga>>(vagaService.getAllVaga(),HttpStatus.OK);
	}
}
