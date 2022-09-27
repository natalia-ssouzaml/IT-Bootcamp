package com.exercicio.maratona;

import java.util.ArrayList;
import java.util.List;

public class Inscricao {

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public List<Candidato> getCandidatoListCircuitoPequeno() {
        return candidatoListCircuitoPequeno;
    }

    public void setCandidatoListCircuitoPequeno(List<Candidato> candidatoListCircuitoPequeno) {
        this.candidatoListCircuitoPequeno = candidatoListCircuitoPequeno;
    }

    public List<Candidato> getCandidatoListCircuitoMedio() {
        return candidatoListCircuitoMedio;
    }

    public void setCandidatoListCircuitoMedio(List<Candidato> candidatoListCircuitoMedio) {
        this.candidatoListCircuitoMedio = candidatoListCircuitoMedio;
    }

    public List<Candidato> getCandidatoListCircuitoAvancado() {
        return candidatoListCircuitoAvancado;
    }

    public void setCandidatoListCircuitoAvancado(List<Candidato> candidatoListCircuitoAvancado) {
        this.candidatoListCircuitoAvancado = candidatoListCircuitoAvancado;
    }

    private Categoria categoria;

    private Candidato candidato;
    private List<Candidato> candidatoListCircuitoPequeno = new ArrayList<>();
    private List<Candidato> candidatoListCircuitoMedio = new ArrayList<>();
    private List<Candidato> candidatoListCircuitoAvancado = new ArrayList<>();


    public void fazerInscricao(Candidato candidato, Categoria categoria) {
        this.candidato = candidato;
        this.categoria = categoria;
        if (categoria.equals(Categoria.PEQUENO)) {
            candidatoListCircuitoPequeno.add(candidato);
            valorInscricaoPequeno(candidato);

        }
        if (categoria.equals(Categoria.MEDIO)) {
            candidatoListCircuitoMedio.add(candidato);
            valorInscricaoMedio(candidato);
        }
        if (categoria.equals(Categoria.AVANCADO)) {
            candidatoListCircuitoAvancado.add(candidato);
            valorInscricaoAvancado(candidato);
        }

    }

    @Override
    public String toString() {
        String mensagem = "Sua inscrição foi efetuado com sucesso! Maratonista: " + candidato.getNome() + ", Categoria: " + categoria;
        return mensagem;
    }

    private void valorInscricaoPequeno(Candidato candidato) {
        //● Inscrição no circuito pequeno: Menores de 18 anos R$1.300. Acima de 18 anos R$
        //1.500.
        int idade = candidato.getIdade();
        if (idade < 18) {
            System.out.println("O valor a ser pago é R$: 1.300");
            System.out.println("Pagamento efetuado, inscrição confirmada!");

        }
        System.out.println("O valor a ser pago é R$: 1.500");
        System.out.println("Pagamento efetuado, inscrição confirmada!");

    }

    private void valorInscricaoMedio(Candidato candidato) {
        // Menores de 18 anos R$ 2.000. Acima de 18 anos R$2.300.

        int idade = candidato.getIdade();

        if (idade < 18) {
            System.out.println("O valor a ser pago é R$: 2.000");
            System.out.println("Pagamento efetuado, inscrição confirmada!");

        }
        System.out.println("O valor a ser pago é R$: 2.300");
        System.out.println("Pagamento efetuado, inscrição confirmada!");

    }

    private void valorInscricaoAvancado(Candidato candidato) {
        // A inscrição não é permitida para menores de 18 anos. Maiores de 18 anos R$ 2.800

        int idade = candidato.getIdade();

        if (idade < 18) {
            System.out.println("Não é permitido inscrições para menores de 18 anos");
        }
        System.out.println("O valor a ser pago é R$: 2.800");


    }

    public String imprimirCandidatos(Categoria categoria) {
        if (categoria.equals(Categoria.PEQUENO)) {
          //  usando forEach e lambda
            candidatoListCircuitoPequeno.forEach(candidato -> System.out.println("Nome: "+ candidato.getNome() + "  Codigo: " + candidato.getCodigo()));

        }
        if (categoria.equals(Categoria.MEDIO)) {
            System.out.println("Lista de candidatos circuito médio: ");
            for (int i = 0; i < candidatoListCircuitoMedio.size(); i++) {
                System.out.println("Nome: " +candidatoListCircuitoMedio.get(i).getNome() + " Codigo: " + candidatoListCircuitoMedio.get(i).getCodigo());
            }
            if (categoria.equals(Categoria.AVANCADO)) {
                for (int i = 0; i < candidatoListCircuitoAvancado.size(); i++) {
                    System.out.println("Lista de candidatos circuito médio: " + candidatoListCircuitoAvancado.get(i).getNome() + " " + candidatoListCircuitoAvancado.get(i).getCodigo());

                }

            }
        }
        String mensagem = "----------------------";
        return mensagem;
    }

    public void CancelarInscricao(Candidato candidato, Categoria categoria) {
        if (categoria.equals(Categoria.PEQUENO)) {
            candidatoListCircuitoPequeno.remove(candidato);
        }
        if (categoria.equals(Categoria.MEDIO)) {
            candidatoListCircuitoMedio.remove(candidato);
        }
        if (categoria.equals(Categoria.AVANCADO)) {
            candidatoListCircuitoAvancado.remove(candidato);
        }

    }
}
