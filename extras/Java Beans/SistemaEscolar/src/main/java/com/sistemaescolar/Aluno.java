/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemaescolar;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lukas
 */
public class Aluno {

    private int id;
    private String Responsavel, tel_responsavel;
    private List<Pessoa> pessoa = new ArrayList<>();
    private List<Turma> turma = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getResponsavel() {
        return Responsavel;
    }

    public void setResponsavel(String Responsavel) {
        this.Responsavel = Responsavel;
    }

    public String getTel_responsavel() {
        return tel_responsavel;
    }

    public void setTel_responsavel(String tel_responsavel) {
        this.tel_responsavel = tel_responsavel;
    }

    public List<Pessoa> getPessoa() {
        return pessoa;
    }

    public void setPessoa(List<Pessoa> pessoa) {
        this.pessoa = pessoa;
    }

    public List<Turma> getTurma() {
        return turma;
    }

    public void setTurma(List<Turma> turma) {
        this.turma = turma;
    }

}
