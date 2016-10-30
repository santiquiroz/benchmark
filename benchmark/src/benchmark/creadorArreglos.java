
package benchmark;

import java.util.Random;

import benchmark.Tiempo;

public class CreadorArreglos {
		
		private int enteros[]   = new  int[10000];
		private double dobles[] = new double[10000];
		private int enterosOrdenados[]   = new  int[10000];
		private double doblesOrdenados[] = new double[10000];
		private int i,s;
		
		public CreadorArreglos() {
			crearTodos();
		}
		
		public void arrayEnterosOrdenados() {
			int i=1;
			for (int s=9999; s>0 ; s--) {
				enterosOrdenados[s] = i;
				i= i+1;
			}
		}
		
		public void arrayDoublesOrdenados() {
			double i = 1.0;
			for (int s=9999; s>0 ; s--) {
				doblesOrdenados[s] = i + 0.5;
				i= i+1;
			}
		}
		
		public void arrayEnteros() {
			for (s=0; s<10000 ; s++){
				enteros[s]= (int) ((Math.random() * (1000000  - 1)) + 1);
				//System.out.println(enteros[s]);
			}
		}
		
		public void arrayDoubles() {
			
			for (s=0; s<10000 ; s++){
				dobles[s]  = (Math.random() * (1000000  - 1) + 1);
			}
		}
		
		public void crearTodos(){
			
			arrayDoubles();
			arrayEnteros();
			arrayEnterosOrdenados();
			arrayDoublesOrdenados();
			
		}
		
		
		//Devolver los arreglos
		public int[] getArrayEnteros(){
			return this.enteros;
		}
		
		public int[] getArrayEnterosOrdenados(){
			return this.enterosOrdenados;
		}
		
		public double[] getArrayDoubles(){
			return this.dobles;
		}
		
		public double[] getArrayDoublesOrdenados(){
			return this.doblesOrdenados;
		}
		
}
