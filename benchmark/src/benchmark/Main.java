
package benchmark;

import java.util.Scanner;

public class Main {
	
	private static Datos datos = new Datos();
	private static GestorDatos gestorDatos = new GestorDatos();
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		datos = gestorDatos.leerDatos();
		if ( datos == null ) {
			gestorDatos.guardarDatos(datos);
			datos = new Datos();
			datos.initalizeMadeTests();
		}
		boolean b = false; int accion;
		
		System.out.println("");
		System.out.println("WELCOME TO THE FUTURE OF BENCHMARKS :v");
		
		do{ 
			System.out.println("");
			System.out.println("===== MENÚ DE CONSOLA =====");
			System.out.println("1. Ejecutar el benchmark");
			System.out.println("2. Comparar resultados");
			System.out.println("3. Salir");
			accion = input.nextInt();
			System.out.println("");
			
			if ( accion == 1 ) {
				CreadorArreglos creadorArreglos = new CreadorArreglos();
				Entero entero = new Entero(creadorArreglos.getArrayEnteros());
				Double doble = new Double(creadorArreglos.getArrayDoubles());
				datos.addTest("---- TEST NUMBER "+(datos.getMadeTests()+1)+" ----",
						creadorArreglos.getArrayEnteros(), creadorArreglos.getArrayEnterosOrdenados(),
						creadorArreglos.getArrayDoubles(), creadorArreglos.getArrayDoublesOrdenados(),
						entero.getTimeQuickSort(), entero.getTimeSuma(), entero.getTimeResta(), entero.getTimeMultiplicacion(),
						entero.getTimeDivision(), doble.getTimeQuickSort(), doble.getTimeSuma(), doble.getTimeResta(), 
						doble.getTimeMultiplicacion(), doble.getTimeDivision(), doble.getTimeAtan(), 
						gestorDatos.getTiempoLectura(), gestorDatos.getTiempoGuardado());
				gestorDatos.guardarDatos(datos);
				
				System.out.println("===== RESULTADOS DEL BENCHMARK =====  //  ===== BENCHMARK No. "+datos.getMadeTests()+" =====");
				System.out.println("Después de realizar cada una de las operaciones con un arreglo de 1'000.000");
				System.out.println("de datos elegidos aletoriamente se obtuvo:");
				System.out.println("----- Tiempo de operaciones con enteros -----");
				System.out.println("Suma: " + entero.getTimeSuma() + " milisegundos");
				System.out.println("Resta: " + entero.getTimeResta() + " milisegundos");
				System.out.println("Multiplicación: " + entero.getTimeMultiplicacion() + " milisegundos");
				System.out.println("División: " + entero.getTimeDivision() + " milisegundos");
				System.out.println("Actividad de la CPU: " + (entero.getTimeSuma()+entero.getTimeResta()+
						entero.getTimeMultiplicacion()+entero.getTimeDivision()) + " milisegundos");
				System.out.println("Actividad de la RAM (QuickSort): " + entero.getTimeQuickSort() + " milisegundos");
				System.out.println("----- Tiempo de operaciones con punto flotante -----");
				System.out.println("Suma: " + doble.getTimeSuma() + " milisegundos");
				System.out.println("Resta: " + doble.getTimeResta() + " milisegundos");
				System.out.println("Multiplicación: " + doble.getTimeMultiplicacion() + " milisegundos");
				System.out.println("División: " + doble.getTimeDivision() + " milisegundos");
				System.out.println("Arc tangente: " + doble.getTimeAtan() + " milisegundos");
				System.out.println("Actividad de la CPU: " + (doble.getTimeSuma()+doble.getTimeResta()+
						doble.getTimeMultiplicacion()+doble.getTimeDivision()+doble.getTimeAtan()) + " milisegundos");
				System.out.println("Actividad de la RAM (QuickSort): " + doble.getTimeQuickSort() + " milisegundos");
				System.out.println("----- Tiempo de lectura y guardado -----");
				System.out.println("Lectura de datos (HDD): " + gestorDatos.getTiempoLectura() + " milisegundos");
				System.out.println("Guardado de datos (HDD): " + gestorDatos.getTiempoGuardado() + " milisegundos");
				
				
				
				/*
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
				*/
				
			}else if ( accion == 2 ) {
				System.out.println("===== COMPARACIÓN DE RESULTADOS =====");
				System.out.println("");
				for ( int i = 0; i < datos.getMadeTests(); i++ ) {
					System.out.println("===== BENCHMARK No. "+(i+1)+" =====");
					System.out.println("Después de realizar cada una de las operaciones con un arreglo de 1'000.000");
					System.out.println("de datos elegidos aletoriamente se obtuvo:");
					System.out.println("----- Tiempo de operaciones con enteros -----");
					System.out.println("Suma: " + datos.getTimePlusEnteros(i) + " milisegundos");
					System.out.println("Resta: " + datos.getTimeMinusEnteros(i) + " milisegundos");
					System.out.println("Multiplicación: " + datos.getTimeMultiplyEnteros(i) + " milisegundos");
					System.out.println("División: " + datos.getTimeDivideEnteros(i) + " milisegundos");
					System.out.println("Actividad de la CPU: " + (datos.getTimePlusEnteros(i)+datos.getTimeMinusEnteros(i)+
							datos.getTimeMultiplyEnteros(i)+datos.getTimeDivideEnteros(i)) + " milisegundos");
					System.out.println("Actividad de la RAM (QuickSort): " + datos.getTimeQuickSortEnteros(i) + " milisegundos");
					System.out.println("----- Tiempo de operaciones con punto flotante -----");
					System.out.println("Suma: " + datos.getTimePlusDoubles(i) + " milisegundos");
					System.out.println("Resta: " + datos.getTimeMinusDoubles(i) + " milisegundos");
					System.out.println("Multiplicación: " + datos.getTimeMultiplyDoubles(i) + " milisegundos");
					System.out.println("División: " + datos.getTimeDivideDoubles(i) + " milisegundos");
					System.out.println("Arc tangente: " + datos.getTimeAtanDoubles(i) + " milisegundos");
					System.out.println("Actividad de la CPU: " + (datos.getTimePlusDoubles(i)+datos.getTimeMinusDoubles(i)+
							datos.getTimeMultiplyDoubles(i)+datos.getTimeDivideDoubles(i)+datos.getTimeAtanDoubles(i)) + " milisegundos");
					System.out.println("Actividad de la RAM (QuickSort): " + datos.getTimeQuickSortDoubles(i) + " milisegundos");
					System.out.println("----- Tiempo de lectura y guardado -----");
					System.out.println("Lectura de datos (HDD): " + datos.getTimeLectura(i) + " milisegundos");
					System.out.println("Guardado de datos (HDD): " + datos.getTimeGuardado(i) + " milisegundos");
					System.out.println("");
				}
			}else if ( accion == 3 ) {
				//cargaLectura.eliminar();
				gestorDatos.guardarDatos(datos);
				System.out.println("Your PC is going to die");
				b=true;
			}
		}while ( b == false );
			
	}
	
}
