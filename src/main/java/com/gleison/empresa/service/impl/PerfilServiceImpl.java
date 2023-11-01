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
	private PerfilRepo perfilRepo;

	@Override
	public Perfil insert(Perfil perfil) {
		
		return perfilRepo.save(perfil);
	}

	@Override
	public Perfil getPerfil(Integer id) {
		return perfilRepo.findById(id).get();
	}

	@Override
	public List<Perfil> getAllPerfil() {
		return perfilRepo.findAll();
	}

	@Override
	public String delete(Integer id) {
		perfilRepo.deleteById(id);
		
		String data =  "usuario " + id + " deletado com sucesso!";
		return data;
	}

	@Override
	public Perfil update(Perfil perfil) {
		return perfilRepo.save(perfil);
	}

}
