package benchmark;

import java.util.ArrayList;

public class ArrayDouble {
		
	private ArrayList<Double> doubleArray = new ArrayList();
	
	public ArrayDouble() {
		for (int i = 0; i < 100000; i++) {
			this.doubleArray.add(Double.parseDouble(Math.random()));
		}
	}
	
	public ArrayList getDoubleArray() {
		return this.doubleArray;
	}
	
}
