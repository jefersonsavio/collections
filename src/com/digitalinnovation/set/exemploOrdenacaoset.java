package com.digitalinnovation.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class exemploOrdenacaoset {
    public static void main(String[] args) {

        Set<Serie> minhaSerie = new HashSet<>(){{
            add(new Serie("Supernatural", "terror", 45));
            add(new Serie("Big Bang teory", "comedia", 50));
            add(new Serie("Star Trek", "ficcao", 35));

        }};

        for(Serie serie : minhaSerie) 
        System.out.println(serie.getNome() + 
        " - " + serie.getGenero() + " - " +
         serie.getTempoEpisodio());

         System.out.println("imprimindo por ordem de insercao");

         Set<Serie> minhaSerie1 = new LinkedHashSet<>(){{
            add(new Serie("Supernatural", "terror", 45));
            add(new Serie("Big Bang teory", "comedia", 50));
            add(new Serie("Star Trek", "ficcao", 35));

        }};

        for(Serie serie : minhaSerie1) 
        System.out.println(serie.getNome() + 
        " - " + serie.getGenero() + " - " +
         serie.getTempoEpisodio());

         System.out.println("por tempo de episodio");
         
         Set<Serie> minhaSerie2 = new TreeSet<>(minhaSerie);
         for(Serie serie : minhaSerie2) 
         System.out.println(serie.getNome() + 
         " - " + serie.getGenero() + " - " +
          serie.getTempoEpisodio());


        
    }
    
}
 

