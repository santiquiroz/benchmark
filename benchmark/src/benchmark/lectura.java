
package benchmark;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class lectura{
	/*FileInputStream fr = null;
	ObjectInputStream or = null;*/
	
	private int enteros[]=new int [1000000];
	private int quickEnteros[]=new int [1000000];
	private double doubles[]=new double[1000000];
	private double quickDoubles[]=new double [1000000];
	private double lecturaEnteros, lecturaQuickEnteros,  lecturaDoubles ,lecturaQuickDoubles, tiempoLeerTodosArreglos;
	private double guardadoDoubles, guardadoEnteros, guardadoDoublesOrdenados, tiempoGuardarTodosArreglos, guardadoEnterosOrdenados;
	
	Tiempo lectura = new Tiempo();
	Tiempo todos= new Tiempo();
	File carpeta = new File("C:\\temp");
	File arrayEnteros = new File("C:\\temp\\arrayEnteros.txt");
	File arrayDoubles = new File("C:\\temp\\arrayDoubles.txt");
	File arrayEnterosOrdenados = new File("C:\\temp\\arrayEnterosOrdenados.txt");
	File arrayDoublesOrdenados = new File("C:\\temp\\arrayDoublesOrdenados.txt");
	
	//Leer arreglos
	public int[] leerEnteros(){
		arrayEnteros.mkdirs();
		lectura.start();
		FileInputStream fr = null;
		ObjectInputStream or = null;
		try {
			fr = new FileInputStream(arrayEnteros);
			or = new ObjectInputStream(fr);
			try {
				enteros = (int[]) or.readObject();
				
			} catch(ClassNotFoundException e) {
				System.out.println("Error: " + e.toString());
			}
		} catch(IOException e) {
			System.out.println("Error: " + e.toString());
		}
		finally {
			try {
				if (or != null) {
					or.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch(IOException e) {
				System.out.println("Error: " + e.toString());
			}
		}
		lectura.stop();
		lecturaEnteros=lectura.tomo();
		lectura.reset();
		return enteros;
	}
	
	public int[] leerQuickEnteros(){
		arrayEnterosOrdenados.mkdirs();
		FileInputStream fr = null;
		ObjectInputStream or = null;
		lectura.start();
		try {
			fr = new FileInputStream(arrayEnterosOrdenados);
			or = new ObjectInputStream(fr);
			try {
				quickEnteros = (int[]) or.readObject();
				
			} catch(ClassNotFoundException e) {
				System.out.println("Error: " + e.toString());
			}
		} catch(IOException e) {
			System.out.println("Error: " + e.toString());
		}
		finally {
			try {
				if (or != null) {
					or.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch(IOException e) {
				System.out.println("Error: " + e.toString());
			}
		}
		lectura.stop();
		lecturaQuickEnteros=lectura.tomo();
		lectura.reset();
		return quickEnteros;
	}
	
	public double[] leerDoubles(){
		arrayDoubles.mkdirs();
		FileInputStream fr = null;
		ObjectInputStream or = null;
		lectura.start();
		try {
			fr = new FileInputStream(arrayDoubles);
			or = new ObjectInputStream(fr);
			try {
				doubles = (double[]) or.readObject();
				
			} catch(ClassNotFoundException e) {
				System.out.println("Error: " + e.toString());
			}
		} catch(IOException e) {
			System.out.println("Error: " + e.toString());
		}
		finally {
			try {
				if (or != null) {
					or.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch(IOException e) {
				System.out.println("Error: " + e.toString());
			}
		}
		lectura.stop();
		lecturaDoubles=lectura.tomo();
		lectura.reset();
		return doubles;
	}
	
	public double[] leerQuickDoubles(){
		arrayDoublesOrdenados.mkdirs();
		FileInputStream fr = null;
		ObjectInputStream or = null;
		lectura.start();
		try {
			fr = new FileInputStream(arrayDoublesOrdenados);
			or = new ObjectInputStream(fr);
			try {
				quickDoubles = (double[]) or.readObject();
				
			} catch(ClassNotFoundException e) {
				System.out.println("Error: " + e.toString());
			}
		} catch(IOException e) {
			System.out.println("Error: " + e.toString());
		}
		finally {
			try {
				if (or != null) {
					or.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch(IOException e) {
				System.out.println("Error: " + e.toString());
			}
		}
		lectura.stop();
		lecturaDoubles=lectura.tomo();
		lectura.reset();
		return quickDoubles;
	}
	
	//Guardado
	public void guardarEnteros(int a[]){
		FileOutputStream fw = null;
		ObjectOutputStream ow = null;
		lectura.start();
		try {
			fw = new FileOutputStream(arrayEnteros);
			ow = new ObjectOutputStream(fw);
			ow.writeObject(a);
		} catch(IOException e) {
			System.out.println("Error: " + e.toString());
		} finally {
			try {
				if (ow != null) {
					ow.close();
				}
				if (fw != null) {
					fw.close();
				}
			} catch(IOException e) {
				System.out.println("Error: " + e.toString());
			}
		}
		lectura.stop();
		guardadoEnteros = lectura.tomo();
		lectura.reset();
	}

	public void guardarQuickEnteros(int a []){
		FileOutputStream fw = null;
		ObjectOutputStream ow = null;
		lectura.start();
		try {
			fw = new FileOutputStream(arrayEnterosOrdenados);
			ow = new ObjectOutputStream(fw);
			ow.writeObject(a);
		} catch(IOException e) {
			System.out.println("Error: " + e.toString());
		} finally {
			try {
				if (ow != null) {
					ow.close();
				}
				if (fw != null) {
					fw.close();
				}
			} catch(IOException e) {
				System.out.println("Error: " + e.toString());
			}
		}
		lectura.stop();
		guardadoEnterosOrdenados = lectura.tomo();
		lectura.reset();
	}
	
	public void guardarDoubles(double a[]){
		FileOutputStream fw = null;
		ObjectOutputStream ow = null;
		lectura.start();
		try {
			fw = new FileOutputStream(arrayDoubles);
			ow = new ObjectOutputStream(fw);
			ow.writeObject(a);
		} catch(IOException e) {
			System.out.println("Error: " + e.toString());
		} finally {
			try {
				if (ow != null) {
					ow.close();
				}
				if (fw != null) {
					fw.close();
				}
			} catch(IOException e) {
				System.out.println("Error: " + e.toString());
			}
		}
		lectura.stop();
		guardadoDoubles = lectura.tomo();
		lectura.reset();
	}
	
	public void  guardarQuickDoubles(double a[]){
		FileOutputStream fw = null;
		ObjectOutputStream ow = null;	
		lectura.start();
		try {
			fw = new FileOutputStream(arrayDoublesOrdenados);
			ow = new ObjectOutputStream(fw);
			ow.writeObject(a);
		} catch(IOException e) {
			System.out.println("Error: " + e.toString());
		} finally {
			try {
				if (ow != null) {
					ow.close();
				}
				if (fw != null) {
					fw.close();
				}
			} catch(IOException e) {
				System.out.println("Error: " + e.toString());
			}
		}
		lectura.stop();
		guardadoDoublesOrdenados = lectura.tomo();
		lectura.reset();
	}
	
	//Leer todos los arreglos
	public void leerTodosArreglos(){
		todos.start();
		leerDoubles();
		leerEnteros();
		leerQuickDoubles();
		leerQuickDoubles();
		todos.stop();
		tiempoLeerTodosArreglos=todos.tomo();
	}
	
	//Guardar todos los arreglos
	public void guardarTodosArreglos(int enteros[],int enterosOrdenados[],double doubles[],double doublesOrdenados[]){
		todos.start();
		guardarDoubles(doubles);
		guardarQuickDoubles(doublesOrdenados);
		guardarEnteros(enteros);
		guardarQuickEnteros(enterosOrdenados);
		todos.stop();
		tiempoGuardarTodosArreglos=todos.tomo();
	}
	
	//Obtener los tiempos de lectura y guardado
	public double getTiempoLecturaEnteros(){
		return lecturaEnteros;
	}
	
	public double getTiempoLecturaEnterosOrdenados(){
		return lecturaQuickEnteros;
	}
	
	public double getTiempoLecturaDoubles(){
		return lecturaDoubles;
	}	
	
	public double getTiempoLecturaDoublesOrdenados(){
		return lecturaQuickDoubles;
	}
	
	public double getTiempoLecturaTodosArreglos(){
		return tiempoLeerTodosArreglos;
	}
	
	public double getTiempoGuardadoEnteros(){
		return guardadoEnteros;
	}
	
	public double getTiempoGuardadoEnterosOrdenados(){
		return guardadoEnterosOrdenados;
	}
	
	public double getTiempoGuardadoDoubles(){
		return guardadoDoubles;
	}
	
	public double getTiempoGuardadoDoublesOrdenados(){
		return guardadoDoublesOrdenados;
	}
	
	public double getTiempoGuardadoTodosArreglos(){
		return tiempoGuardarTodosArreglos;
	}
	
	//Obtener arreglos 
	public double[] getArrayDouble(){
		return doubles;
	}
	
	public double[] getArrayDoubleOrdenado(){
		return quickDoubles;
	}
	
	public int[] getArrayEntero(){
		return enteros;
	}
	
	public int[] getArrayEnteroOrdenado(){
		return quickEnteros;
	}
	
	//Borrar todos (carpeta que los contiene)
	public void eliminar(){
		if((carpeta.exists())){
			carpeta.delete();
		}
	}
		
}



	
