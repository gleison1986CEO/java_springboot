package com.gleison.empresa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gleison.empresa.models.Perfil;
import com.gleison.empresa.repo.PerfilRepo;
import com.gleison.empresa.service.PerfilService;

@Service
public class PerfilServiceImpl implements PerfilService{
	
	@Autowired
	private PerfilRepo personRepo;

	@Override
	public Perfil insert(Perfil person) {
		
		return personRepo.save(person);
	}

	@Override
	public Perfil getPerfil(Integer id) {
		// TODO Auto-generated method stub
		return personRepo.findById(id).get();
	}

	@Override
	public List<Perfil> getAllPerfil() {
		// TODO Auto-generated method stub
		return personRepo.findAll();
	}

	@Override
	public String delete(Integer id) {
		// TODO Auto-generated method stub
		personRepo.deleteById(id);
		return "person deleted ";
	}

	@Override
	public Perfil update(Perfil person) {
		// TODO Auto-generated method stub
		return personRepo.save(person);
	}

}
