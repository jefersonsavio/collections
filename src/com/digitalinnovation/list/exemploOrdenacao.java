package com.digitalinnovation.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class exemploOrdenacao {

    public static void main(String[] args) {
        List<Gato> gatos = new ArrayList<>() {
            {
                add(new Gato("maiu", 2, "branco"));
                add(new Gato("miau", 3, "preto"));
                add(new Gato("tigre", 5, "tigrado"));
            }
        };
        System.out.println("--\tOrdem de inserção\t--");
        System.out.println(gatos);

        System.out.println("--\tOrdem de aleatoria\t--");
        Collections.shuffle(gatos);
        System.out.println(gatos);

        System.out.println("--\tOrdem de idade\t--");
        Collections.sort(gatos, new ComparatorIdade());
        System.out.println(gatos);

        System.out.println("--\tOrdem de cor\t--");
        Collections.sort(gatos ,new ComparatorCor());
        System.out.println(gatos);

        System.out.println("--\tOrdem de noem/cor/idade\t--");
        Collections.sort(gatos ,new ComparatorNomeCorIdade());
        System.out.println(gatos);

    }

}

class Gato implements Comparable<Gato> {
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Gato [nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }

}

class ComparatorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }


}

class ComparatorCor implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }

}

class ComparatorNomeCorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {

        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if(nome != 0) return nome;
        
        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor !=0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }

}


