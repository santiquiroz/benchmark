package benchmark;

public class Double {
	
	private double arrayTest[] = new double[1000000];
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
		quickSort(arrayTest,arrayTest[0],arrayTest[arrayTest.length-1]);
		time.stop(); return time.tomo();
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
	}
	
}
