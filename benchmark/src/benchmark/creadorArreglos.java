
package benchmark;

import java.util.Random;
import benchmark.Main.*;

import benchmark.Tiempo;

public class CreadorArreglos {
	
	    //De esta variable se cambia el tamaño de todos los arreglos y su numero mayor debe ser 2,147,483,648 para no producir errores
		final static int valorArray = 2000000000;
		
		private int enteros[]   = new  int[valorArray];
		private double dobles[] = new double[valorArray];
		private int enterosOrdenados[]   = new  int[valorArray];
		private double doblesOrdenados[] = new double[valorArray];
		private int i,s;
		
		public CreadorArreglos() {
			crearTodos();
		}
		
		public void arrayEnterosOrdenados() {
			int i=1;
			for (int s=(valorArray-1); s>0 ; s--) {
				enterosOrdenados[s] = i;
				i= i+1;
			}
		}
		
		public void arrayDoublesOrdenados() {
			double i = 1.0;
			for (int s=(valorArray-1); s>0 ; s--) {
				doblesOrdenados[s] = i + 0.5;
				i= i+1;
			}
		}
		
		public void arrayEnteros() {
			for (s=0; s<valorArray ; s++){
				enteros[s]= (int) ((Math.random() * (valorArray  - 1)) + 1);
				//System.out.println(enteros[s]);
			}
		}
		
		public void arrayDoubles() {
			
			for (s=0; s<valorArray ; s++){
				dobles[s]  = (Math.random() * (valorArray  - 1) + 1);
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
