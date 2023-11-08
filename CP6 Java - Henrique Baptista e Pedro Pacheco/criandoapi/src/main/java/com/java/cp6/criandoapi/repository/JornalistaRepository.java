package com.java.cp6.criandoapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.cp6.criandoapi.model.Jornalista;

public interface JornalistaRepository extends JpaRepository<Jornalista, Long> {
  
}
