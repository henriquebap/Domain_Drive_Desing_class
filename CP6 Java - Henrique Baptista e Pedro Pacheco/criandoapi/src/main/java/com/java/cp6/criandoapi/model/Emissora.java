package com.java.cp6.criandoapi.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_EMISSORA")
public class Emissora {
  
  public Emissora() {
  }

  public Emissora(Long id, String nome, String estado, Integer anoFundacao, List<Jornalista> jornalistas) {
    this.id = id;
    this.nome = nome;
    this.estado = estado;
    setAnoFundacao(anoFundacao);
    this.jornalistas = jornalistas;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nome;
  private String estado;
  private Integer anoFundacao;

  @OneToMany(mappedBy =  "emissora")
  @JsonIgnore
  private List<Jornalista> jornalistas;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public Integer getAnoFundacao() {
    return anoFundacao;
  }

  public void setAnoFundacao(Integer anoFundacao) {
    if(anoFundacao < 1930){
      throw new IllegalArgumentException("Ano de Fundação Invalida");
    }
    this.anoFundacao = anoFundacao;
  }

  public List<Jornalista> getJornalistas() {
    return jornalistas;
  }

  public void setJornalistas(List<Jornalista> jornalistas) {
    this.jornalistas = jornalistas;
  }
  
}
