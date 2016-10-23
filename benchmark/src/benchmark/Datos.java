
package benchmark;

import java.util.ArrayList;

public class Datos {
	
	private ArrayList<String> descripcion = new ArrayList<>();
	private ArrayList<int []> enterosArray = new ArrayList<>();
	private ArrayList<int []> enterosOrdenadosArray = new ArrayList<>();
	private ArrayList<double []> doublesArray = new ArrayList<>();
	private ArrayList<double []> doublesOrdenadosArray = new ArrayList<>();
	private double [] timeQuickSortEnteros;
	private double [] timePlusEnteros;
	private double [] timeMinusEnteros;
	private double [] timeMultiplyEnteros;
	private double [] timeDivideEnteros;
	private double [] timeQuickSortDoubles;
	private double [] timePlusDoubles;
	private double [] timeMinusDoubles;
	private double [] timeMultiplyDoubles;
	private double [] timeDivideDoubles;
	private double [] timeAcosDoubles;
	private double [] timeLectura;
	private int free;
	
	public void addTest(String descripcion, int[] enterosArray, int[] enterosOrdenadosArray, double[] doublesArray,
			double[] doublesOrdenadosArray, double timeQuickSortEnteros, double timePlusEnteros, double timeMinusEnteros,
			double timeMultiplyEnteros, double timeDivideEnteros, double timeQuickSortDoubles, double timePlusDoubles, 
			double timeMinusDoubles, double timeMultiplyDoubles, double timeDivideDoubles, double timeAcosDoubles, 
			double timeLectura ) {
		this.descripcion.add(descripcion);
		this.enterosArray.add(enterosArray);
		this.enterosOrdenadosArray.add(enterosOrdenadosArray);
		this.doublesArray.add(doublesArray);
		this.doublesOrdenadosArray.add(doublesOrdenadosArray);
		this.timeQuickSortEnteros[free] = timeQuickSortEnteros;
		this.timePlusEnteros[free] = timePlusEnteros;
		this.timeMinusEnteros[free] = timeMinusEnteros;
		this.timeMultiplyEnteros[free] = timeMultiplyEnteros;
		this.timeDivideEnteros[free] = timeDivideEnteros;
		this.timeQuickSortDoubles[free] = timeQuickSortDoubles;
		this.timePlusDoubles[free] = timePlusDoubles;
		this.timeMinusDoubles[free] = timeMinusDoubles;
		this.timeMultiplyDoubles[free] = timeMultiplyDoubles;
		this.timeDivideDoubles[free] = timeDivideDoubles;
		this.timeAcosDoubles[free] = timeAcosDoubles;
		this.timeLectura[free] = timeLectura;
		free = free + 1;
	}
	
	public String getDescripcion(int i) {
		return descripcion.get(i);
	}
	
	public int[] getEnterosArray(int i) {
		return enterosArray.get(i);
	}
	
	public int[] getEnterosOrdenadosArray(int i) {
		return enterosOrdenadosArray.get(i);
	}
	
	public double[] getDoublesArray(int i) {
		return doublesArray.get(i);
	}
	
	public double[] getDoublesOrdenadosArray(int i) {
		return doublesOrdenadosArray.get(i);
	}
	
	public double getTimeQuickSortEnteros(int i) {
		return timeQuickSortEnteros[i];
	}
	
	public double getTimePlusEnteros(int i) {
		return timePlusEnteros[i];
	}
	
	public double getTimeMinusEnteros(int i) {
		return timeMinusEnteros[i];
	}
	
	public double getTimeMultiplyEnteros(int i) {
		return timeMultiplyEnteros[i];
	}
	
	public double getTimeDivideEnteros(int i) {
		return timeDivideEnteros[i];
	}
	
	public double getTimeQuickSortDoubles(int i) {
		return timeQuickSortDoubles[i];
	}
	
	public double getTimePlusDoubles(int i) {
		return timePlusDoubles[i];
	}
	
	public double getTimeMinusDoubles(int i) {
		return timeMinusDoubles[i];
	}
	
	public double getTimeMultiplyDoubles(int i) {
		return timeMultiplyDoubles[i];
	}
	
	public double getTimeDivideDoubles(int i) {
		return timeDivideDoubles[i];
	}
	
	public double getTimeAcosDoubles(int i) {
		return timeAcosDoubles[i];
	}
	
	public double getTimeLectura(int i) {
		return timeLectura[i];
	}
	
	public int getTestsRealizados() {
		return free;
	}
	
}
