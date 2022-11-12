package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Exemplolist {

	public static void main(String[] args) {
		System.out.println("Crie uma losta e adicione sete notas");

		List<Double> notas = new ArrayList<>();
		notas.add(7.0);
		notas.add(8.5);
		notas.add(9.3);
		notas.add(5.0);
		notas.add(7.0);
		notas.add(0.0);
		notas.add(3.6);

		System.out.println(notas.toString());
		System.out.println("Exibindo a posição d nota 5: " + notas.indexOf(5.0));

		System.out.println("adiocione a nota 8 na posicao 4");
		notas.add(4, 8.0);
		System.out.println(notas);

		System.out.println("substitua a ota 5 pela nota 6");
		notas.set(notas.indexOf(5.0), 6.0);
		System.out.println(notas);

		System.out.println("confira se a nota 5 esta na lista");
		System.out.println(notas.contains(5.0));

		System.out.println("exibindo as notas na ordem informada");
		for (Double nota : notas)
			System.out.println(nota);

		System.out.println("exibindo a terceira nota: " + notas.get(2));

		System.out.println("exibindo a menor nota: " + Collections.min(notas));

		System.out.println("exibindo a maior nota: " + Collections.max(notas));

		Iterator<Double> it = notas.iterator();
		double soma = 0.0;
		while (it.hasNext()) {
			Double next = it.next();
			soma += next;
		}

		System.out.println("somando as notas: " + soma);
		System.out.println("Exibindo a media das notas: " + soma / notas.size());
		System.out.println(notas);
		System.out.println("removendo a nota 0 ");
		notas.remove(0.0);
		System.out.println(notas);
		System.out.println("removendo a nota de posicao 0");
		notas.remove(0);
		System.out.println(notas);

		System.out.println("removendo as nota menores que 7.0");

		Iterator<Double> it2 = notas.iterator();
		while (it2.hasNext()) {
			Double next = it2.next();
			if (next < 7) {
				it2.remove();
			}

			System.out.println(notas);

		}

		notas.clear();
		System.out.println("apagando toda a lista: " + notas);
		System.out.println("conferindo se a lista esta vazia: " + notas.isEmpty());

	}

}
