package benchmark;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class lectura {
	FileInputStream fr = null;
	ObjectInputStream or = null;
	int enteros[]=new int [1000000];
	int quickEnteros[]=new int [1000000];
	double doubles[]=new double[1000000];
	double quickDoubles[]=new double [1000000];
	tiempo lectura = new tiempo();
	String lecturaEnteros, lecturaQuickEnteros,  lecturaDoubles ,lecturaQuickDoubles;
	public int[] leerEnteros(){
		File archivo = new File("D:\\DANIEL\\Documents\\Estudios\\Universidad Nacional\\Algoritmos y Programación\\Programación Orientada a Objetos\\Eclipse Workspace\\datos\\ej1");
		try {
				fr = new FileInputStream(archivo);
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
		File archivo = new File("D:\\DANIEL\\Documents\\Estudios\\Universidad Nacional\\Algoritmos y Programación\\Programación Orientada a Objetos\\Eclipse Workspace\\datos\\ej1");
		try {
				fr = new FileInputStream(archivo);
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
		File archivo = new File("D:\\DANIEL\\Documents\\Estudios\\Universidad Nacional\\Algoritmos y Programación\\Programación Orientada a Objetos\\Eclipse Workspace\\datos\\ej1");
		try {
				fr = new FileInputStream(archivo);
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
		File archivo = new File("D:\\DANIEL\\Documents\\Estudios\\Universidad Nacional\\Algoritmos y Programación\\Programación Orientada a Objetos\\Eclipse Workspace\\datos\\ej1");
		try {
				fr = new FileInputStream(archivo);
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
}
