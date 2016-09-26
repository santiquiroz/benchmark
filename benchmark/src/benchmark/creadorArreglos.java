package benchmark;
import java.util.*;
import benchmark.tiempo;

public class creadorArreglos {
		
			int enteros[]   = new  int  [1000000 ];
			double dobles[] = new double[1000000 ];
			int enterosordenados[]   = new  int  [1000000 ];
			double doblesordenados[] = new double[1000000 ];
			
			tiempo tiempoordint = new tiempo();
			tiempo tiemporandint = new tiempo();
			tiempo tiempoorddoub = new tiempo();
			tiempo tiemporanddoub = new tiempo();
			
			tiempo tiemposumaenterosordenados = new tiempo();
			tiempo tiemposumadoublesordenados = new tiempo();
				
			int s;
			int i=1;
			double z;
			double u;
			
			tiempoordint.start();
			tiempoorddoub.start();
			
			//Para hacer las listas "Enteros ordenados" y "Dobles ordenados", de forma descendente
			for (s=999999; s>0 ; s--){
				
				enterosordenados[s] = i;
				doblesordenados[s] =  i+0.5;
				i= i+1;
			}
			
			tiempoordint.stop();
			tiempoorddoub.stop();
			
			tiemporandint.start();
			tiemporanddoub.start();
			
			//Para hacer las listas "Enteros" y "Dobles" con números random entre 1 y 1000000 
			for (s=0; s<1000000 ; s++){
				enteros[s] = (int)(Math.random() * (1000000  - 1) + 1);
				dobles[s]  = (Math.random() * (1000000  - 1) + 1);
			}
			
			tiemporandint.stop();
			tiemporanddoub.stop();

			z=0;
			u=0;
			
			for (s=0; s<1000000 ; s++){
				
				z=z+enteros[s];
				u=u+dobles[s];
				
			}
			
			System.out.println("Crear la lista ordenada de los enteros se tomó " + tiempoordint.tomo());
			System.out.println("Crear la lista ordenada de los doubles se tomó " + tiempoorddoub.tomo());
			System.out.println("Crear la lista random de los enteros se tomó " + tiemporandint.tomo());
			System.out.println("Crear la lista random de los doubles se tomó " + tiemporanddoub.tomo());
			System.out.println("La suma de la lista ordenada de los enteros se tomó " + z + " milisegundos");
			System.out.println("La suma de la lista ordenada de los enteros se tomó " + u + " milisegundos");
			
		}
	
}
