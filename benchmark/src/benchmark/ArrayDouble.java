package benchmark;

import java.util.ArrayList;

public class ArrayDouble {
		
	private double doubleArray[] = new double[1000000];
	int i;
	
	public ArrayDouble() {
		for (int s=0; s<1000000 ; s++){
			doubleArray[s]  = (Math.random() * (1000000  - 1) + 1);
		}
	}
	
	public double[] getDoubleArray() {
		return this.doubleArray;
	}
	
}
