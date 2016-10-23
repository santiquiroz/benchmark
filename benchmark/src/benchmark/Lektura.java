
package benchmark;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

//CLASE MACHETAZO A LA "lectura" ORIGINAL
public class Lektura {
	
	private static File archivo = new File("datos");
	
	public static Datos leerDatos() {
		Datos datos = null;
		FileInputStream fr = null;
		ObjectInputStream or = null;
		try {
			fr = new FileInputStream(archivo);
			or = new ObjectInputStream(fr);
			try {
				datos = (Datos)or.readObject();
			} catch(ClassNotFoundException e) {
				
			}
		} catch(IOException e) {
			System.out.println("Error: " + e.toString());
		} finally {
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
		return datos;
	}
	
}
