package benchmark;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

import benchmark.tiempo.*;

import benchmark.tiempo;
public class Main {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Double operacionesDouble = new Double();
		Entero operacionesEntero = new Entero();
		int ArregloEnteros[]=new int [1000000];
		int ArregloOrdenadoEnteros[]=new int [1000000];
		double ArregloDoubles[]=new double[1000000];
		double ArregloOrdenadoDoubles[]=new double [1000000];
		lectura cargar = new lectura();
		System.out.println("bienvenido a el futuro de los benchmarks :v");
		//carga
		ArregloEnteros=cargar.leerEnteros();
		ArregloDoubles=cargar.leerDoubles();
		ArregloOrdenadoEnteros=cargar.leerQuickEnteros();
		ArregloOrdenadoDoubles=cargar.leerDoubles();
		
		int m;
		int i = 1;
		while ( i == 1 ) {
			System.out.println("1. Correr el Becnchmark.");
			System.out.println("2. Salir.");
			m = entrada.next();  :v ni idea que no me acuerdo del input :v
			if ( m == 1 ) {
				creadorArreglos misArreglos = new creadorArreglos();
			}else if ( m == 2 ) {
				i = 0;
				System.out.println("bye!");
			}
		}
		
		
	}
}


