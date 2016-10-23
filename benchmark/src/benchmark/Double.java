
package benchmark;

public class Double {
	
	private double a [];
	private double timeQuickSort;
	private double timePlus;
	private double timeMinus;
	private double timeMultiply;
	private double timeDivide;
	private double timeAcos;
	
	
	public Double(double a []) {
		this.a = a;
		procesador(this.a);
	}
	
	public void procesador(double a []) { 
		timePlus(a);
		timeMinus(a);
		timeMultiply(a);
		timeDivide(a);
		timeAcos(a);
		timeQuickSort(a);
	}
	
	public void timeQuickSort(double a[]) {
		QuickSort quickSort = new QuickSort(a);
		timeQuickSort = quickSort.getTiempoQuickSort();
	}
	
	public void timePlus(double a[]) {
		Tiempo time = new Tiempo();
		double X = a[0];
		time.reset(); time.start();
		for (int i = 1; i < a.length; i++) {
			X = X + a[i];
		}
		time.stop(); timePlus= time.tomo(); time.reset();
	}
	
	public void timeMinus( double a[]) {
		Tiempo time = new Tiempo();
		double X = a[0];
		time.reset(); time.start();
		for (int i = 1; i < a.length; i++) {
			X = X - a[i];
		}
		time.stop(); timeMinus=time.tomo(); time.reset();
	}
	
	public void timeMultiply(double a[]) {
		Tiempo time = new Tiempo();
		double X = a[0];
		time.reset(); time.start();
		for (int i = 1; i < a.length; i++) {
			X = X * a[i];
		}
		time.stop(); timeMultiply =time.tomo(); time.reset();
	}
	
	public void timeDivide( double a[]) {
		Tiempo time = new Tiempo();
		double X = a[0];
		time.reset(); time.start();
		for (int i = 1; i < a.length; i++) {
			X = X / a[i];
		}
		time.stop(); timeDivide= time.tomo(); time.reset();
	}
	
	public void timeAcos( double a[]) {
		Tiempo time = new Tiempo();
		time.reset(); time.start();
		@SuppressWarnings("unused")
		double X;
		for (int i = 1; i < a.length; i++) {
			X = Math.acos(a[i]);
		}
		time.stop(); timeAcos= time.tomo(); time.reset();
	}
	
	//Obtener los tiempos
	public double getTimeQuickSort(){ 	//Éste nos sirve es para la RAM
		return timeQuickSort;
	}
	
	public double getTimeCoseno(){
		return timeAcos;
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
	
	public double getTotalTime(){		//Tener en cuenta que sólo estamos tomando los del proceso en la CPU
		return timeAcos+timePlus+timeMinus+timeMultiply+timeDivide;
	}
	
	public double[] getArray() {
		return a;
	}
	
}
