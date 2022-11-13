package list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class exemploOrdenacao {

    public static void main(String[] args) {
        List<Gato> gatos = new ArrayList<>() {
            {
                add(new Gato("maiu", 2, "branco"));
                add(new Gato("xanim", 3, "preto"));
                add(new Gato("tigre", 5, "tigrado"));
            }
        };
        System.out.println("--\tOrdem de inserção\t--");
        System.out.println(gatos);

        System.out.println("--\tOrdem de aleatoria\t--");
        Collections.shuffle(gatos);

        
    }

}

class Gato {
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

}
