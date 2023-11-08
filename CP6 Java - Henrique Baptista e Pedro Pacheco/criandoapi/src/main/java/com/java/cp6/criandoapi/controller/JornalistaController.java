package com.java.cp6.criandoapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.cp6.criandoapi.model.Emissora;
import com.java.cp6.criandoapi.model.Jornalista;
import com.java.cp6.criandoapi.repository.EmissoraRepository;
import com.java.cp6.criandoapi.repository.JornalistaRepository;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/jornalistas")
public class JornalistaController {
  
  @Autowired
  private JornalistaRepository repository;

  @Autowired
  private EmissoraRepository emissoraRepository;

  @GetMapping
  public List<Jornalista> findAll(){
    return repository.findAll();
  }

  @GetMapping("/{id}")
  public Jornalista findById(@PathVariable Long id){
    return repository.findById(id).get();
  }

  @PostMapping
  @Transactional
  public Jornalista save(@RequestBody Jornalista jornalista){
    Emissora emissora = emissoraRepository.findById(jornalista.getEmissora().getId()).get();
    jornalista.setEmissora(emissora);
    return repository.save(jornalista);
  }

  @DeleteMapping("/{id}")
  public void deleteJornalista(@PathVariable Long id){
    Jornalista jornalista = repository.findById(id).get();
    repository.delete(jornalista);
  }

}
