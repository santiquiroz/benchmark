package benchmark;

import java.util.ArrayList;

public class ArrayDouble {
		
	private ArrayList<double> doubleArray = new ArrayList<double>();
	
	public ArrayDouble() {
		for (int i = 0; i < 100000; i++) {
			doubleArray.add(Math.random());
		}
	}
	
	public ArrayList getDoubleArray() {
		return this.doubleArray;
	}
	
}
