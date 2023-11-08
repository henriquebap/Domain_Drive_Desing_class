package com.java.cp6.criandoapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.cp6.criandoapi.model.Emissora;

public interface EmissoraRepository extends JpaRepository<Emissora, Long> {
  
}
