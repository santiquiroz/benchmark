
package benchmark;

import benchmark.Tiempo;

public class creadorArreglos {
		
		private int enteros[]   = new  int  [1000000 ];
		private double dobles[] = new double[1000000 ];
		private int enterosOrdenados[]   = new  int  [1000000 ];
		private double doblesOrdenados[] = new double[1000000 ];
		private int s;
		private int i;
		private double z;
		private double u;
		private Tiempo tiempoTodos= new Tiempo();
		private Tiempo tiempoEnterosOrdenados = new Tiempo();
		private Tiempo tiempoDoublesOrdenados = new Tiempo();
		private Tiempo tiempoEnteros = new Tiempo();
		private Tiempo tiempoDoubles = new Tiempo();
		
		public void arrayEnterosOrdenados() {
			i = 1;
			tiempoEnterosOrdenados.reset();
			tiempoEnterosOrdenados.start();
			for (s=999999; s>0 ; s--) {
				enterosOrdenados[s] = i;
				i= i+1;
			}
			tiempoEnterosOrdenados.stop();
		}
		
		public void arrayDoublesOrdenados() {
			i = 1;
			tiempoDoublesOrdenados.reset();
			tiempoDoublesOrdenados.start();
			for (s=999999; s>0 ; s--) {
				doblesOrdenados[s] = i + 0.5;
				i= i+1;
			}
			tiempoDoublesOrdenados.stop();
		}
		
		public void arrayEnteros() {
			u = 0;
			tiempoEnteros.reset();
			tiempoEnteros.start();
			for (s=0; s<1000000 ; s++){
				enteros[s] = (int)(Math.random() * (1000000  - 1) + 1);
			}
			for (s=0; s<1000000 ; s++){
				u = u + enteros[s];
			}
			tiempoEnteros.stop();
		}
		
		public void arrayDoubles() {
			z = 0;
			tiempoDoubles.reset();
			tiempoDoubles.start();
			for (s=0; s<1000000 ; s++){
				dobles[s]  = (Math.random() * (1000000  - 1) + 1);
			}
			for (s=0; s<1000000 ; s++){
				z = z + dobles[s];
			}
			tiempoDoubles.stop();
		}
		
		public void crearTodos(){
			tiempoTodos.start();
			arrayDoubles();
			arrayEnteros();
			arrayEnterosOrdenados();
			arrayDoublesOrdenados();
			tiempoTodos.stop();
		}
		
		//Devolver el tiempo que se demoró 
		public double getTiempoEnterosOrdenados() {
			return tiempoEnterosOrdenados.tomo();
		}
		
		public double getTiempoDoublesOrdenados() {
			return tiempoDoublesOrdenados.tomo();
		}
		
		public double getTiempoEnteros() {
			return tiempoEnteros.tomo();
		}
		
		public double getTiempoDoubles() {
			return tiempoDoubles.tomo();
		}
		
		public double getTiempoTodos(){
			return tiempoTodos.tomo();
		}
		
		//Devolver los arreglos
		public int[] getArrayEnteros(){
			return this.enteros;
		}
		
		public int[] getArrayEnterosOrdenados(){
			return this.enterosOrdenados;
		}
		
		public double[] getArrayDouble(){
			return this.dobles;
		}
		
		public double[] getArrayDoubleOrdenado(){
			return this.doblesOrdenados;
		}
		
		
		
		/*
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
	*/
}
