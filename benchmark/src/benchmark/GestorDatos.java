
package benchmark;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//Código robado de SuPropiedadRaiz, copyright by Santiago, pirateado by Juancho  :v
public class GestorDatos {
	
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
	
	public static void guardarDatos(Datos data) {
		FileOutputStream fw = null;
		ObjectOutputStream ow = null;
		try {
			fw = new FileOutputStream(archivo);
			ow = new ObjectOutputStream(fw);
			ow.writeObject(data);
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
	}
	
}
