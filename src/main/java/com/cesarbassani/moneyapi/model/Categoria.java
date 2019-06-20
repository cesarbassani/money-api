package com.cesarbassani.moneyapi.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "categoria")
public class Categoria extends EntidadeBase {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
