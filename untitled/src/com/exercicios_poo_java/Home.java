package com.exercicios_poo_java;

public class Home {
    public static void main(String[] args) {
        //criando maratonistas
        Candidato candidato = new Candidato("Natalia", "Souza", "54150", 23, 119838434, 1902, "A+");
        Candidato candidatoII = new Candidato("Paulo", "Lima", "47362", 27, 119523456, 1902, "BNegativo");
        Candidato candidatoIII = new Candidato("Antonio", "Bispo", "47362", 43, 119523456, 1902, "BNegativo");
        Candidato candidatoIV = new Candidato("Dilma", "Araujo", "47362", 17, 119523456, 1902, "BNegativo");
        //fazendo novas inscricoes
        Inscricao novaInscricao = new Inscricao();
        novaInscricao.fazerInscricao(candidato, Categoria.PEQUENO);
        System.out.println(novaInscricao);
        System.out.println("---------------------");
        novaInscricao.fazerInscricao(candidatoII, Categoria.MEDIO);
        System.out.println(novaInscricao);
        System.out.println("---------------------");
        novaInscricao.fazerInscricao(candidatoIII, Categoria.PEQUENO);
        System.out.println(novaInscricao);
        System.out.println("---------------------");
        novaInscricao.fazerInscricao(candidatoIV, Categoria.MEDIO);
        System.out.println(novaInscricao);
        System.out.println("---------------------");
        //imprimindo cada candidato na categoria certa

        System.out.println(novaInscricao.imprimirCandidatos(Categoria.MEDIO));
        System.out.println(novaInscricao.imprimirCandidatos(Categoria.PEQUENO));

        //cancelando inscrição de um candidato e imprimindo a lista novamente

        novaInscricao.CancelarInscricao(candidato, Categoria.PEQUENO);
        System.out.println(novaInscricao.imprimirCandidatos(Categoria.PEQUENO));

    }
}
