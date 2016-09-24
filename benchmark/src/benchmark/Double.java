package benchmark;

import java.util.ArrayList;

public class Double {
	
	private ArrayList<Double> arrayTest = new ArrayList();
	private String timeQuickSort;
	private String timePlus;
	private String timeMinus;
	private String timeMultiply;
	private String timeDivide;
	private String timeAcos;
	private double X;
	private tiempo time = new tiempo();
	
	public Double() {
		ArrayDouble arrayDouble = new ArrayDouble();
		timeQuickSort = timeQuickSort(arrayDouble);
		timePlus = timePlus(arrayDouble);
		timeMinus = timeMinus(arrayDouble);
		timeMultiply = timeMultiply(arrayDouble);
		timeDivide = timeDivide(arrayDouble);
		timeAcos = timeAcos(arrayDouble);
	}
	
	public String timeQuickSort(ArrayDouble arrayDouble) {
		arrayTest = arrayDouble.getDoubleArray();
		time.reset(); time.start();
		quickSort(arrayTest,arrayTest.get(0),arrayTest.get(arrayTest.size()-1));
		time.stop(); return time.tomo();
	}
	
	public String timePlus(ArrayDouble arrayDouble) {
		arrayTest = arrayDouble.getDoubleArray();
		X = arrayTest.get(0);
		time.reset(); time.start();
		for (int i = 1; i < arrayTest.size(); i++) {
			X = X + arrayTest.get(i);
		}
		time.stop(); return time.tomo();
	}
	
	public String timeMinus(ArrayDouble arrayDouble) {
		arrayTest = arrayDouble.getDoubleArray();
		X = arrayTest.get(0);
		time.reset(); time.start();
		for (int i = 1; i < arrayTest.size(); i++) {
			X = X - arrayTest.get(i);
		}
		time.stop(); return time.tomo();
	}
	
	public String timeMultiply(ArrayDouble arrayDouble) {
		arrayTest = arrayDouble.getDoubleArray();
		X = arrayTest.get(0);
		time.reset(); time.start();
		for (int i = 1; i < arrayTest.size(); i++) {
			X = X * arrayTest.get(i);
		}
		time.stop(); return time.tomo();
	}
	
	public String timeDivide(ArrayDouble arrayDouble) {
		arrayTest = arrayDouble.getDoubleArray();
		X = arrayTest.get(0);
		time.reset(); time.start();
		for (int i = 1; i < arrayTest.size(); i++) {
			X = X / arrayTest.get(i);
		}
		time.stop(); return time.tomo();
	}
	
	public String timeAcos(ArrayDouble arrayDouble) {
		arrayTest = arrayDouble.getDoubleArray();
		time.reset(); time.start();
		for (int i = 1; i < arrayTest.size(); i++) {
			X = acos(arrayTest.get(i));
		}
		time.stop(); return time.tomo();
	}
	
	private void quickSort(ArrayList<Double> arrayDouble, Double left, Double right) {
		Double X = arrayDouble.get(left); // tomamos primer elemento como pivote
		  int i=left; // i realiza la búsqueda de izquierda a derecha
		  int j=right; // j realiza la búsqueda de derecha a izquierda
		  int aux;
		 
		  while(i<j){            // mientras no se crucen las búsquedas
		     while(A[i]<=X && i<j) i++; // busca elemento mayor que pivote
		     while(A[j]>X) j--;         // busca elemento menor que pivote
		     if (i<j) {                      // si no se han cruzado                      
		         aux= A[i];                  // los intercambia
		         A[i]=A[j];
		         A[j]=aux;
		     }
		   }
		   A[left]=A[j]; // se coloca el pivote en su lugar de forma que tendremos
		   A[j]=X; // los menores a su izquierda y los mayores a su derecha
		   if(left<j-1)
		      quickSort(A,left,j-1); // ordenamos subarray izquierdo
		   if(j+1 <right)
		      quickSort(A,j+1,right); // ordenamos subarray derecho
		}
	
}
