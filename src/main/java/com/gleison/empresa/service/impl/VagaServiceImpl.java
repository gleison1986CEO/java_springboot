package com.gleison.empresa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gleison.empresa.models.Vaga;
import com.gleison.empresa.repo.VagaRepo;
import com.gleison.empresa.service.VagaService;

@Service
public class VagaServiceImpl implements VagaService{
	
	@Autowired
	private VagaRepo vagaRepo;

	@Override
	public Vaga insert(Vaga vaga) {
		return vagaRepo.save(vaga);
	}

	@Override
	public Vaga getVaga(Integer id) {
		return vagaRepo.findById(id).get();
	}

	@Override
	public List<Vaga> getAllVaga() {
		return vagaRepo.findAll();
	}

	@Override
	public String delete(Integer id) {
		vagaRepo.deleteById(id);
		String data =  "vaga " + id + " deletado com sucesso!";
		return data;
	}

	@Override
	public Vaga update(Vaga vaga) {
		return vagaRepo.save(vaga);
	}

}
