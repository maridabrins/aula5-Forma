package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Forma;
import entidade.Retangulo;
import entidade.Triangulo;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<Forma> lista = new ArrayList<>();
		
		System.out.println("Base do triangulo = ");
		double base = s.nextDouble();
		
		System.out.println("Altura do triangulo = ");
		double alturaT = s.nextDouble();
		
		Forma t = new Triangulo(base, 0, alturaT );
		lista.add(t);
		
		
		System.out.println("Largura do retangulo: ");
		double largura = s.nextDouble();
		
		System.out.println("Altura do retangulo: ");
		double alturaR = s.nextDouble();
		
		Forma r = new Retangulo(0, largura, alturaR);
		lista.add(r);
		
		System.out.println(lista);
		
		
		
		

		
		
		
		s.close();
	}

}
