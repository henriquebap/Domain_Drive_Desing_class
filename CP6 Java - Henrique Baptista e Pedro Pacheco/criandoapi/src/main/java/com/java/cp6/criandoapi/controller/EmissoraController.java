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
import com.java.cp6.criandoapi.repository.EmissoraRepository;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/emissoras")
public class EmissoraController {
  
  @Autowired
  private EmissoraRepository repository;

  @GetMapping
  public List<Emissora> findAll(){
    return repository.findAll();
  }

  @GetMapping("/{id}")
  public Emissora findById(@PathVariable Long id){
    return repository.findById(id).get();
  }

  @PostMapping
  @Transactional
  public Emissora save(@RequestBody Emissora emissora){
    return repository.save(emissora);
  }

  @DeleteMapping("/{id}")
  public void deleteEmissora(@PathVariable Long id){
    Emissora emissora = repository.findById(id).get();
    repository.delete(emissora);
  }
  
}
