
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
		int ArregloEnteros[]; int ArregloOrdenadoEnteros[];
		double ArregloDoubles[]; double ArregloOrdenadoDoubles[];
		Lectura cargaLectura = new Lectura();
		CreadorArreglos creadorArreglos = new CreadorArreglos();
		boolean b = false; int accion;
		
		
		System.out.println("WELCOME TO THE FUTURE OF BENCHMARKS :v");
		
		do{ 
			System.out.println("===== CONSOLE MENU ====");
			System.out.println("1. Execute benchmark test");
			System.out.println("2. ¡Go out of here!");
			System.out.println("");
			accion = entrada.nextInt();
			
			if(accion==1){
				
				//Creación de arreglos
				creadorArreglos.crearTodos();
				ArregloDoubles=creadorArreglos.getArrayDouble();
				ArregloEnteros=creadorArreglos.getArrayEnteros();
				ArregloOrdenadoDoubles=creadorArreglos.getArrayDoubleOrdenado();
				ArregloOrdenadoEnteros=creadorArreglos.getArrayEnterosOrdenados();
				
				//Guardado
				cargaLectura.guardarTodos(ArregloEnteros,ArregloOrdenadoEnteros,ArregloDoubles,ArregloOrdenadoDoubles);
				
				//Lectura
				cargaLectura.leerTodos();
				ArregloEnteros=cargaLectura.getArrayEntero();
				ArregloDoubles=cargaLectura.getArrayDouble();
				ArregloOrdenadoEnteros=cargaLectura.getArrayEnteroOrdenado();
				ArregloOrdenadoDoubles=cargaLectura.getArrayDoubleOrdenado();
				
				//Operaciones 
				operacionesDouble.timeQuickSort(ArregloOrdenadoDoubles);
				operacionesEntero.timeQuickSort(ArregloOrdenadoEnteros);
				operacionesDouble.procesador(ArregloDoubles);
				operacionesEntero.sacarTiempo(ArregloEnteros);
				
				//Impresión de resultados
				System.out.println("tiempo de escritura: "+cargaLectura.getTiempoGuardadoTodos()+" milisegundos");
				
			}else if(accion==2){
				cargaLectura.eliminar();
				b=true;
			}
			
		}while(b==false);
			
	}
	
}
