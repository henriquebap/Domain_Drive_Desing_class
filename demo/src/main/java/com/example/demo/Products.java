package com.example.demo;

public class Products {
    private Long id;
    private String nome;
    private Float preco;

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

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Products(Long id, String nome, Float preco, Department department) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.department = department;
    }
    public Products(){

    }
}
