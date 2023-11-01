package com.gleison.empresa.service.impl;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import org.apache.tomcat.util.digester.DocumentProperties.Charset;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gleison.empresa.models.Perfil;
import com.gleison.empresa.repo.PerfilRepo;
import com.gleison.empresa.service.PerfilService;
import java.awt.Desktop;
import java.net.URI; //Note this is URI, not U

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
    
	public String methods(){
	    String method = "My method is here";
		return method;
		
	}

	@Override
	public List<Perfil> getAllPerfil() {
		List data = perfilRepo.findAll();
		// System.out.println(methods());
        return data;
		
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
