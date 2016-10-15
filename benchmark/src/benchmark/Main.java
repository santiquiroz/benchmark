package benchmark;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;
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
		lectura cargaLectura = new lectura();
		creadorArreglos creador = new creadorArreglos();
		System.out.println("bienvenido a el futuro de los benchmarks :v");
		//creacion de arreglos
		creador.crearTodos();
		ArregloDoubles=creador.getArrayDouble();
		ArregloEnteros=creador.getArrayEnteros();
		ArregloOrdenadoDoubles=creador.getArrayDoubleOrdenado();
		ArregloOrdenadoEnteros=creador.getArrayEnterosOrdenados();
		//guardado
		cargaLectura.guardarTodos(ArregloEnteros,ArregloOrdenadoEnteros,ArregloDoubles,ArregloOrdenadoDoubles);
		//lectura
		
		cargaLectura.leerTodos();
		
		ArregloEnteros=cargaLectura.getArrayEntero();
		ArregloDoubles=cargaLectura.getArrayDouble();
		ArregloOrdenadoEnteros=cargaLectura.getArrayEnteroOrdenado();
		ArregloOrdenadoDoubles=cargaLectura.getArrayDoubleOrdenado();
		
		int m;
		int i = 1;
		while ( i == 1 ) {
			System.out.println("1. Correr el Becnchmark.");
			System.out.println("2. Salir.");
			m = entrada.nextInt(); // :v ni idea que no me acuerdo del input :v.... pos yo si :V asi que lo coloco nextInt();
			if ( m == 1 ) {
				creadorArreglos misArreglos = new creadorArreglos();
			}else if ( m == 2 ) {
				i = 0;
				System.out.println("bye!");
			}
		}
		
		
	}
}


