package benchmark;
import java.io.*;
import java.util.ArrayList;
import benchmark.tiempo;
public class operaciones {
		FileInputStream fr = null;
		ObjectInputStream or = null;
		ArrayList<Integer> enteros;
		tiempo sf = new tiempo();
		
		File archivo = new File("D:\\DANIEL\\Documents\\Estudios\\Universidad Nacional\\Algoritmos y Programación\\Programación Orientada a Objetos\\Eclipse Workspace\\datos\\ej1");
		try {
				fr = new FileInputStream(archivo);
				or = new ObjectInputStream(fr);
				try {
					enteros = (ArrayList<Integer>)or.readObject();
					
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
		}
	}

