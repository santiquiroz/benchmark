package benchmark;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import benchmark.tiempo.*;

import benchmark.tiempo;
public class Main {
	
	public static void main(String[] args) {
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
		
		
		
	}
}


