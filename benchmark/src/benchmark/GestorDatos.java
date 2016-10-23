
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
	private static Tiempo tiempo = new Tiempo();
	private static double tiempoLectura;
	private static double tiempoGuardado;
	
	public static Datos leerDatos() {
		tiempo.start();
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
		tiempo.stop();
		tiempoLectura = tiempo.tomo();
		tiempo.reset();
		return datos;
	}
	
	public static void guardarDatos(Datos data) {
		tiempo.start();
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
		tiempo.stop();
		tiempoGuardado = tiempo.tomo();
		tiempo.reset();
	}
	
	public double getTiempoLectura() {
		return tiempoLectura;
	}
	
	public double getTiempoGuardado() {
		return tiempoGuardado;
	}
	
}
