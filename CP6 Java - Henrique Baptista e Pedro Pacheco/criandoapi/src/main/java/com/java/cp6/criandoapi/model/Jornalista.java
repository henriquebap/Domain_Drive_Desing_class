package com.java.cp6.criandoapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_JORNALISTA")
public class Jornalista {

  public Jornalista() {
  }

  public Jornalista(Long id, String name, String cpf, String rg, Emissora emissora) {
    this.id = id;
    this.name = name;
    setCpf(cpf);
    setRg(rg);
    this.emissora = emissora;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String cpf;
  private String rg;

  @ManyToOne
  @JoinColumn(name = "emissora_id", nullable = false)
  private Emissora emissora;

  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public void setCpf(String cpf) {
    if (cpf != null && cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
        this.cpf = cpf;
    } else {
        throw new IllegalArgumentException("CPF invalido");
    }
  }

  public String getCpf() {
    return cpf;
  }

  public void setRg(String rg) {
    if (rg != null && rg.matches("^[0-9]{8}$")) {
        this.rg = rg;
    } else {
        throw new IllegalArgumentException("RG invalido");
    }
  }
  public String getRg() {
    return rg;
  }

  public Emissora getEmissora() {
    return emissora;
  }

  public void setEmissora(Emissora emissora) {
    this.emissora = emissora;
  }
  

}
