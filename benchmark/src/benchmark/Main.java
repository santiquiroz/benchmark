
package benchmark;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;
import benchmark.Tiempo;

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
		boolean b=false;int accion;
		
		System.out.println("WELCOME TO THE FUTURE OF BENCHMARKS :v");
		
		do{ 
			System.out.println("===== CONSOLE MENU ====");
			System.out.println("1. Execute benchmark test");
			System.out.println("2. ¡Go out of here!");
			System.out.println("");
			accion=entrada.nextInt();
			
			if(accion==1){
				
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
				
				//operaciones 
				operacionesDouble.timeQuickSort(ArregloOrdenadoDoubles);
				operacionesEntero.timeQuickSort(ArregloOrdenadoEnteros);
				operacionesDouble.procesador(ArregloDoubles);
				operacionesEntero.sacarTiempo(ArregloEnteros);
				
				//impresion de resultados
				System.out.println("tiempo de escritura: "+cargaLectura.getTiempoGuardadoTodos()+" milisegundos");
				
			}else if(accion==2){
				cargaLectura.eliminar();
				b=true;
			}
			
		}while(b==false);
			
	}
	
}
