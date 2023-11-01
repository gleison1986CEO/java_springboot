package com.gleison.empresa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gleison.empresa.models.Vaga;

@Repository
public interface VagaRepo extends JpaRepository<Vaga, Integer>{

}
