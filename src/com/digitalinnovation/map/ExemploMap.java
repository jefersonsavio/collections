package com.digitalinnovation.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExemploMap {
    public static void main(String[] args) {

        System.out.println("criando dicionario de carros e seus consumos");
        
        Map<String, Double> carroPopular = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carroPopular.toString());

        System.out.println("substituindo o condumo do uno");
        carroPopular.put("uno", 16.1);
        System.out.println(carroPopular);

        System.out.println("conferindo se o modelo tucson esta no dicionario de carros: " 
        + carroPopular.containsKey("tucson"));

        System.out.println("conferindo o consumo do uno: " + carroPopular.get("uno"));

        System.out.println("exibindo os modelos: " + carroPopular.keySet());

        System.out.println("exibindo o consumo dos carros: " + carroPopular.values());

        
        Double economico = Collections.max(carroPopular.values());
        Set<Map.Entry<String, Double>> entries = carroPopular.entrySet();
        String modeloEconomico = "";

        for(Map.Entry<String, Double> entry : entries){
            if(entry.getValue().equals(economico)){
                modeloEconomico = entry.getKey();
                System.out.println("Exibindo o modelo mais economico: "+ modeloEconomico
                 + " - " + economico );

            }
            
        }

        Double beberrao = Collections.min(carroPopular.values());
        Set<Map.Entry<String, Double>> entries1 = carroPopular.entrySet();
        String modelobeberrao = "";

        for(Map.Entry<String, Double> entry : entries1){
            if(entry.getValue().equals(beberrao)){
                modelobeberrao = entry.getKey();
                System.out.println("Exibindo o modelo mais beberrao: "+ modelobeberrao
                 + " - " + beberrao );

            }
        }

        Iterator<Double> iterator = carroPopular.values().iterator();
        Double soma = 0.0;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("soma dos consumos: " + soma);


        System.out.println("media de consumos de todos os carros : "
         + soma/carroPopular.size());
         
         System.out.println(carroPopular);
         System.out.println("removendo modelo com consumo 15.6");
         Iterator<Double> iterator2 = carroPopular.values().iterator();
        while(iterator2.hasNext()){
            if(iterator2.next() == 15.6){
                iterator2.remove();
            }

        }
        System.out.println(carroPopular);

        System.out.println("exibindo na ordem informada");
        Map<String, Double> carroPopular2 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carroPopular2.toString());

        System.out.println("exibindo ordenado pelo modelo");
        Map<String, Double> carroPopular3 = new TreeMap<>(carroPopular2);
        System.out.println(carroPopular3);

        System.out.println("apagando todo do dicionario: ");
        carroPopular.clear();
        carroPopular2.clear();
        carroPopular3.clear();
        System.out.println("verificando se foi tudo apagado: " + carroPopular.isEmpty());






            


    }
    
}
