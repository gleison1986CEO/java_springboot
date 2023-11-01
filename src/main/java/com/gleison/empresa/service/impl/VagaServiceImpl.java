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
		// TODO Auto-generated method stub
		return vagaRepo.findById(id).get();
	}

	@Override
	public List<Vaga> getAllVaga() {
		// TODO Auto-generated method stub
		return vagaRepo.findAll();
	}

	@Override
	public String delete(Integer id) {
		// TODO Auto-generated method stub
		vagaRepo.deleteById(id);
		return "person deleted ";
	}

	@Override
	public Vaga update(Vaga vaga) {
		// TODO Auto-generated method stub
		return vagaRepo.save(vaga);
	}

}
