package benchmark;
import benchmark.tiempo;

public class creadorArreglos {
		
		public int enteros[]   = new  int  [1000000 ];
		public double dobles[] = new double[1000000 ];
		public int enterosOrdenados[]   = new  int  [1000000 ];
		public double doblesOrdenados[] = new double[1000000 ];
		
		private int s;
		private int i;
		private double z;
		private double u;
		
		public tiempo tiempoEnterosOrdenados = new tiempo();
		public tiempo tiempoDoublesOrdenados = new tiempo();
		public tiempo tiempoEnteros = new tiempo();
		public tiempo tiempoDoubles = new tiempo();
		
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
		
		public void arrayDoblesOrdenados() {
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
		
		public void arrayDobles() {
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
		
		public double tiempoEnterosOrdenados() {
			return tiempoEnterosOrdenados.tomo();
		}
		
		public double tiempoDoublesOrdenados() {
			return tiempoDoublesOrdenados.tomo();
		}
		
		public double tiempoEnteros() {
			return tiempoEnteros.tomo();
		}
		
		public double tiempoDoubles() {
			return tiempoDoubles.tomo();
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
