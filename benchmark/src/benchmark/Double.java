package benchmark;

public class Double {
	
	private double timeQuickSort;
	private double timePlus;
	private double timeMinus;
	private double timeMultiply;
	private double timeDivide;
	private double timeAcos;
	private double X;
	private tiempo time = new tiempo();
	private QuickSort quickSort = new QuickSort();
	
	public void procesador(double a []) { 
		timePlus(a);
		 timeMinus(a);
		 timeMultiply(a);
		 timeDivide(a);
		 timeAcos(a);
	}
	
	public void timeQuickSort(double a[]) {
		timeQuickSort= quickSort.tiempoQuickSort(a);
	}
	
	public void timePlus(double a[]) {
		X = a[0];
		time.reset(); time.start();
		for (int i = 1; i < a.length; i++) {
			X = X + a[i];
		}
		time.stop(); timePlus= time.tomo();
	}
	
	public void timeMinus( double a[]) {
		
		X = a[0];
		time.reset(); time.start();
		for (int i = 1; i < a.length; i++) {
			X = X - a[i];
		}
		time.stop(); timeMinus=time.tomo();
	}
	
	public void timeMultiply(double a[]) {
		
		X = a[0];
		time.reset(); time.start();
		for (int i = 1; i < a.length; i++) {
			X = X * a[i];
		}
		time.stop(); timeMultiply =time.tomo();
	}
	
	public void timeDivide( double a[]) {
		X = a[0];
		time.reset(); time.start();
		for (int i = 1; i < a.length; i++) {
			X = X / a[i];
		}
		time.stop(); timeDivide= time.tomo();
	}
	
	public void timeAcos( double a[]) {
		
		time.reset(); time.start();
		for (int i = 1; i < a.length; i++) {
			X = Math.acos(a[i]);
		}
		time.stop(); timeAcos= time.tomo();
	}
	
	//obtener los tiempos
	public double getTimeQuickSort(){//este nos sirve es para la ram
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
	public double getTotalTime(){//tener en cuenta que solo estamos tomando los del proceso en la cpu
		return timeAcos+timePlus+timeMinus+timeMultiply+timeDivide;
	}
}
