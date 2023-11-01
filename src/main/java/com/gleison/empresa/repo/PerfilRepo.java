package com.gleison.empresa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gleison.empresa.models.Perfil;

@Repository
public interface PerfilRepo extends JpaRepository<Perfil, Integer>{

}
