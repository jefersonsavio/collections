package com.digitalinnovation.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class exeploOrdenanacaoMap {
    public static void main(String[] args) {
        System.out.println("---Ordem aleatoria---");

        Map<String, Livro>meulivro = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("uma breve historia no tempo", 256));
            put("Duhigg, Charles", new Livro("O poder dp habito", 408));
            put("Harari, Duval Noah", new Livro("21 Licoes para o seculo 21", 432));
        }};

        for(Map.Entry<String, Livro> livro : meulivro.entrySet()){
            System.out.println(livro.getKey() + " --- " + livro.getValue().getNome());
        }
        System.out.println("---Ordem de entrada---");

        Map<String, Livro>meulivro1 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("uma breve historia no tempo", 256));
            put("Duhigg, Charles", new Livro("O poder dp habito", 408));
            put("Harari, Duval Noah", new Livro("21 Licoes para o seculo 21", 432));
        }};
        for(Map.Entry<String, Livro> livro : meulivro1.entrySet()){
            System.out.println(livro.getKey() + " --- " + livro.getValue().getNome());
        }

        System.out.println("---Ordem alfabetica---");

        Map<String, Livro>meulivro2 = new TreeMap<>(meulivro1);
        for(Map.Entry<String, Livro> livro : meulivro2.entrySet()){
            System.out.println(livro.getKey() + " --- " + livro.getValue().getNome());
        }

        System.out.println("Ordem alfabetica dos livros");
        Set<Map.Entry<String, Livro>> meulivro3 = new TreeSet<>(new ComparatorNome());
        meulivro3.addAll(meulivro.entrySet());
        for(Map.Entry<String, Livro> livro : meulivro3){
            System.out.println(livro.getKey() + " --- " + livro.getValue().getNome());
        }
        

    }

}







class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer pagina) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((paginas == null) ? 0 : paginas.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Livro other = (Livro) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (paginas == null) {
            if (other.paginas != null)
                return false;
        } else if (!paginas.equals(other.paginas))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Livro [nome=" + nome + ", paginas=" + paginas + "]";
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }

}
