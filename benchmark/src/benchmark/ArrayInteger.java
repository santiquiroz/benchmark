package benchmark;

import java.util.ArrayList;

public class ArrayInteger {
	
	private ArrayList<Integer> integerArray = new ArrayList();
	
	public ArrayInteger() {
		for (int i = 0; i < 100000; i++) {
			this.integerArray.add((int)(Math.random()*10));
		}
	}
	
	public ArrayList getIntegerArray() {
		return this.integerArray;
	}
	
}
