package com.gleison.empresa.service;

import java.util.List;

import com.gleison.empresa.models.Perfil;

public interface PerfilService {

	public Perfil insert(Perfil perfil);
	
	public Perfil getPerfil(Integer id);
	
	public List<Perfil> getAllPerfil();
	
	public String delete(Integer id);
	
	public Perfil update(Perfil pperfil);
}
