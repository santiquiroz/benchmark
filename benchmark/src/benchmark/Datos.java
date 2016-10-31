
package benchmark;

import java.io.Serializable;
import java.util.ArrayList;

import org.hyperic.sigar.Mem;

public class Datos implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ArrayList<String> descripcion = new ArrayList<>();
	public int [] enterosArray;
	public int [] enterosOrdenadosArray;
	public double [] doublesArray ;
	public double [] doublesOrdenadosArray;
	private String[] arquitecturas = new String[10000];
	private String[] cpus= new String[10000];
	private String[] cores= new String[10000];
	private String[] cache= new String[10000];
	private Mem[] RAM= new Mem[10000];
	private double [] timeQuickSortEnteros = new double[10000];
	private double [] timePlusEnteros = new double[10000];
	private double [] timeMinusEnteros = new double[10000];
	private double [] timeMultiplyEnteros = new double[10000];
	private double [] timeDivideEnteros = new double[10000];
	private double [] timeQuickSortDoubles = new double[10000];
	private double [] timePlusDoubles = new double[10000];
	private double [] timeMinusDoubles = new double[10000];
	private double [] timeMultiplyDoubles = new double[10000];
	private double [] timeDivideDoubles = new double[10000];
	private double [] timeAtanDoubles = new double[10000];
	private double [] timeLectura = new double[10000];
	private double [] timeGuardado = new double[10000];
	private int free;
	
	public void addTest(String descripcion,String arquitect, String cpu,String nucleos,String cach,Mem ramm,double timeQuickSortEnteros, double timePlusEnteros, double timeMinusEnteros,
			double timeMultiplyEnteros, double timeDivideEnteros, double timeQuickSortDoubles, double timePlusDoubles, 
			double timeMinusDoubles, double timeMultiplyDoubles, double timeDivideDoubles, double timeAtanDoubles, 
			double timeLectura, double timeGuardado) {
		this.descripcion.add(descripcion);
		this.arquitecturas[free]=arquitect;
		this.cpus[free]=cpu;
		this.cores[free]=nucleos;
		this.cache[free]=cach;
		this.RAM[free] = ramm;
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
		this.timeAtanDoubles[free] = timeAtanDoubles;
		this.timeLectura[free] = timeLectura;
		this.timeGuardado[free] = timeGuardado;
		free = free + 1;
	}
	
	public String getDescripcion(int i) {
		return descripcion.get(i);
	}
	
	public int[] getEnterosArray() {
		return enterosArray;
	}
	
	public int[] getEnterosOrdenadosArray() {
		return enterosOrdenadosArray;
	}
	
	public double[] getDoublesArray(/*int i*/) {
		return doublesArray;
	}
	
	public double[] getDoublesOrdenadosArray(/*int i*/) {
		return doublesOrdenadosArray;
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
	
	public double getTimeAtanDoubles(int i) {
		return timeAtanDoubles[i];
	}
	
	public double getTimeLectura(int i) {
		return timeLectura[i];
	}
	
	public double getTimeGuardado(int i) {
		return timeGuardado[i];
		
	}
	public String getArquitectura(int i) {
		return this.arquitecturas[i];
	}
	
	
	public int getMadeTests() {
		return free;
	}
	
	public void initalizeMadeTests() {
		free = 0;
	}
	public void setArrays(int[] enterosArra,int[] enterosOrdenadosArra,double[] doublesArra,double[] doublesOrdenadosArra ){
		this.enterosArray=enterosArra;
		this.enterosOrdenadosArray=enterosOrdenadosArra;
		this.doublesArray=doublesArra;
		this.doublesOrdenadosArray=doublesOrdenadosArra;
	}

	public String getCpu(int i) {
		return this.cpus[i];
	}

	public String getCore(int i) {
		return this.cores[i];
	}

	public String getCache(int i) {
		return this.cache[i];
	}

	
}
