package benchmark;

public class Double {
	
	/*private double arrayTest[] = new double[1000000];
	private String timeQuickSort;
	private String timePlus;
	private String timeMinus;
	private String timeMultiply;
	private String timeDivide;
	private String timeAcos;
	private double X;
	private tiempo time = new tiempo();
	private QuickSort quickSort = new QuickSort();
	
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
		return quickSort.tiempoQuickSort(arrayTest,0,arrayTest.length-1);
	}
	
	public String timePlus(ArrayDouble arrayDouble) {
		arrayTest = arrayDouble.getDoubleArray();
		X = arrayTest[0];
		time.reset(); time.start();
		for (int i = 1; i < arrayTest.length; i++) {
			X = X + arrayTest[i];
		}
		time.stop(); return time.tomo();
	}
	
	public String timeMinus(ArrayDouble arrayDouble) {
		arrayTest = arrayDouble.getDoubleArray();
		X = arrayTest[0];
		time.reset(); time.start();
		for (int i = 1; i < arrayTest.length; i++) {
			X = X - arrayTest[i];
		}
		time.stop(); return time.tomo();
	}
	
	public String timeMultiply(ArrayDouble arrayDouble) {
		arrayTest = arrayDouble.getDoubleArray();
		X = arrayTest[0];
		time.reset(); time.start();
		for (int i = 1; i < arrayTest.length; i++) {
			X = X * arrayTest[i];
		}
		time.stop(); return time.tomo();
	}
	
	public String timeDivide(ArrayDouble arrayDouble) {
		arrayTest = arrayDouble.getDoubleArray();
		X = arrayTest[0];
		time.reset(); time.start();
		for (int i = 1; i < arrayTest.length; i++) {
			X = X / arrayTest[i];
		}
		time.stop(); return time.tomo();
	}
	
	public String timeAcos(ArrayDouble arrayDouble) {
		arrayTest = arrayDouble.getDoubleArray();
		time.reset(); time.start();
		for (int i = 1; i < arrayTest.length; i++) {
			X = Math.acos(arrayTest[i]);
		}
		time.stop(); return time.tomo();
	}*/
	private double timeQuickSort;
	private double timePlus;
	private double timeMinus;
	private double timeMultiply;
	private double timeDivide;
	private double timeAcos;
	private double totalTime;
	private double X;
	private tiempo time = new tiempo();
	private QuickSort quickSort = new QuickSort();
	
	
	public void sacarTiempo(double a []) {
		
		 timeQuickSort(a);
		 timePlus(a);
		 timeMinus(a);
		 timeMultiply(a);
		 timeDivide(a);
		 timeAcos(a);
	}
	
	public void timeQuickSort(double a[]) {
		timeQuickSort= quickSort.tiempoQuickSort(a,0,a.length-1);
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
	
}
