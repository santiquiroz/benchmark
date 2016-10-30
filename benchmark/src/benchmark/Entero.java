
package benchmark;

public class Entero extends QuickSort{
	
	private int a [];
	private double timeDivide,timeMinus,timeMultiply,timePlus,timeQuickSort; 
	
	public Entero(int a []) {
		this.a = a;
		procesador(this.a);
	}
	
	public void procesador(int a []) {
		 sumaEntero(a);
		 restaEntero(a);
		 multiplicacionEntero(a);
		 divisionEnteros(a);
		 quickSortEnteros(a);
	}
	
	//Suma
	public void sumaEntero (int enteros[]){ 
		Tiempo suma = new Tiempo();
		@SuppressWarnings("unused")
		int a=enteros[0];
		suma.start();
		for(int i =1;i<(enteros.length);i++){
			a+=enteros[i];
		}
		suma.stop();
		timePlus= suma.tomo();
	}
	
	//Resta
	public void restaEntero(int enteros[]){
		Tiempo resta = new Tiempo();
		@SuppressWarnings("unused")
		int b=enteros[0];
		resta.start();
		for(int i=1;i<enteros.length;i++){
			b-=enteros[i];
		}
		resta.stop();
		timeMinus = resta.tomo();
	}
	
	//Multiplicacion 
	public void multiplicacionEntero(int enteros[]){
		
		Tiempo multiplicacion =new Tiempo();
		@SuppressWarnings("unused")
		int c=enteros[0];
		multiplicacion.start();
		for(int i=1 ;i<enteros.length;i++){
			c*=enteros[i];
		}
		multiplicacion.stop();
		timeMultiply= multiplicacion.tomo();
	}
	
	//Division
	public void divisionEnteros(int enteros[]){
		Tiempo division = new Tiempo();
		@SuppressWarnings("unused")
		int d = enteros[0] ;
		division.start();
		for ( int i=1; i<enteros.length;i++){
			d=d/(enteros[i]);
		}
		division.stop();
		timeDivide= division.tomo();
	}
	
	//Ordenamiento
	public void quickSortEnteros(int e[]){
		QuickSort quickSort = new QuickSort(e);
		timeQuickSort = quickSort.getTiempoQuickSort();
	}
	
	//Obtener tiempos 
	public double getTimeQuickSort(){	//Éste nos sirve es para la RAM
		return timeQuickSort;
	}
	
	public double getTimeSuma(){
		return timePlus;
	}
	
	public double getTimeResta(){
		return timeMinus;
	}
	
	public double getTimeMultiplicacion(){
		return timeMultiply;
	}
	
	public double getTimeDivision(){
		return timeDivide;
	}
	
	public double getTotalTime(){	//Tener en cuenta que solo estamos tomando los del proceso en la cpu
		return timePlus+timeMinus+timeMultiply+timeDivide;
	}
	
	public int [] getArray() {
		return a;
	}
	
}

