package com.digitalinnovation.set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exemploset {
    public static void main(String[] args) {
        
        System.out.println("Crie um conjunto e adicione as notas");

        Set <Double> notas = new HashSet<>(Arrays.asList(7d, 8.5,9.3, 5d, 7d, 0d,3.6));

        System.out.println(notas);

        System.out.println("confirerindo se a nota 5.0 esta no conjunto: " + notas.contains(5d));

        System.out.println("exibindo a menor nota: " + Collections.min(notas));

        System.out.println("exibindo a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
		double soma = 0.0;
		while (iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}
        System.out.println("somando as notas: " + soma);
		System.out.println( "Exibindo a media das notas: " + soma / notas.size());
		System.out.println(notas);

        notas.remove(0d);
        System.out.println("removendo a nota 0: " + notas);

        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }

        System.out.println(notas);

        Set <Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println("Exibindo na ordem informada" + notas2);  

        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("apagando e conferindo se o conjunto esta vazio");
        notas.clear();
        System.out.println(notas.isEmpty());




    }
    
}
