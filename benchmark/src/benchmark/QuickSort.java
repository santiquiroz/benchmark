
package benchmark;

public class QuickSort {
	
	public double tiempoQuickSort(double A[]){
		Tiempo bench = new Tiempo();
		bench.start();
		quicksort(A,0,A.length-1);
		bench.stop();
		return bench.tomo();
	}
	
	public double tiempoQuickSort(int A[]){
		Tiempo bench = new Tiempo();
		bench.start();
		quicksort(A,0,A.length-1);
		bench.stop();
		return bench.tomo();
	}
	
	public void quicksort (double A[], int izq, int der) {
		  
		  double pivote=A[izq]; // tomamos primer elemento como pivote
		  int i=izq; // i realiza la b�squeda de izquierda a derecha
		  int j=der; // j realiza la b�squeda de derecha a izquierda
		  double aux;
		 
		  while(i<j){            // mientras no se crucen las b�squedas
		     while(A[i]<=pivote && i<j) i++; // busca elemento mayor que pivote
		     while(A[j]>pivote) j--;         // busca elemento menor que pivote
		     if (i<j) {                      // si no se han cruzado                      
		         aux= A[i];                  // los intercambia
		         A[i]=A[j];
		         A[j]=aux;
		     }
		   }
		   A[izq]=A[j]; // se coloca el pivote en su lugar de forma que tendremos
		   A[j]=pivote; // los menores a su izquierda y los mayores a su derecha
		   if(izq<j-1)
		      quicksort(A,izq,j-1); // ordenamos subarray izquierdo
		   if(j+1 <der)
		      quicksort(A,j+1,der); // ordenamos subarray derecho
		   
		}
	
	public void quicksort (int A[], int izq, int der) {

		  int pivote=A[izq]; // tomamos primer elemento como pivote
		  int i=izq; // i realiza la b�squeda de izquierda a derecha
		  int j=der; // j realiza la b�squeda de derecha a izquierda
		  int aux;
		 
		  while(i<j){            // mientras no se crucen las b�squedas
		     while(A[i]<=pivote && i<j) i++; // busca elemento mayor que pivote
		     while(A[j]>pivote) j--;         // busca elemento menor que pivote
		     if (i<j) {                      // si no se han cruzado                      
		         aux= A[i];                  // los intercambia
		         A[i]=A[j];
		         A[j]=aux;
		     }
		   }
		   A[izq]=A[j]; // se coloca el pivote en su lugar de forma que tendremos
		   A[j]=pivote; // los menores a su izquierda y los mayores a su derecha
		   if(izq<j-1)
		      quicksort(A,izq,j-1); // ordenamos subarray izquierdo
		   if(j+1 <der)
		      quicksort(A,j+1,der); // ordenamos subarray derecho
		   
		}
	
}
