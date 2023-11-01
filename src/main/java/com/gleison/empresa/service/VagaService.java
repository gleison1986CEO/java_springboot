package com.gleison.empresa.service;

import java.util.List;

import com.gleison.empresa.models.Vaga;

public interface VagaService {

	public Vaga insert(Vaga vaga);
	
	public Vaga  getVaga(Integer id);
	
	public List<Vaga > getAllVaga();
	
	public String delete(Integer id);
	
	public Vaga  update(Vaga vaga);
}
