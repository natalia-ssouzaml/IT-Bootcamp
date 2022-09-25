package com.exercicios_poo_java;

public class Candidato {
    private String nome;
    private String sobrenome;
    private String RG;
    private int idade;
    private int celular;
    private int numeroDeEmergencia;
    private int codigo;
    private String grupoSanguineo;
    private static int gerarCodigo = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getNumeroDeEmergencia() {
        return numeroDeEmergencia;
    }

    public void setNumeroDeEmergencia(int numeroDeEmergencia) {
        this.numeroDeEmergencia = numeroDeEmergencia;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public Candidato(String nome, String sobrenome, String RG, int idade, int celular, int numeroDeEmergencia, String grupoSanguineo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.RG = RG;
        this.idade = idade;
        this.celular = celular;
        this.numeroDeEmergencia = numeroDeEmergencia;
        this.grupoSanguineo = grupoSanguineo;
        gerarCodigo++;
        this.codigo = gerarCodigo;
    }

}
