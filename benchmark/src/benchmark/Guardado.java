
package benchmark;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Guardado {
	
	private static File archivo = new File("datos");
	
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
