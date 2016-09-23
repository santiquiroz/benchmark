package benchmark;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import benchmark.tiempo.*;

import benchmark.tiempo;
public class Main {

	public static void main(String[] args) {
		tiempo sw = new tiempo();
		//enteros
		sw.start();
		FileInputStream fr = null;
		ObjectInputStream or = null;
		ArrayList<Integer> enteros=new ArrayList();
		tiempo lectura = new tiempo();
		
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
		lectura.stop();
		lectura.tomo();
		lectura.reset();
		//suma
		tiempo suma = new tiempo();
		int a=0;
		suma.start();
		for(int i =0;i<(enteros.size());i++){
			a+=enteros.get(i);
		}
		suma.stop();
		suma.tomo();
		//resta
		tiempo resta = new tiempo();
		int b=0;
		resta.start();
		for(int i=0;i<=enteros.size();i++){
			b-=enteros.get(i);
		}
		resta.stop();
		resta.tomo();
		//multiplicacion 
		tiempo multiplicacion =new tiempo();
		int c=0;
		multiplicacion.start();
		for(int i=0 ;i<=enteros.size();i++){
			c*=enteros.get(i);
		}
		multiplicacion.stop();
		multiplicacion.tomo();
		//division
		tiempo division = new tiempo();
		int d = 0;
		division.start();
		for ( int i=0; i<=enteros.size();i++){
			d=enteros.get(i);
		}
		division.stop();
		division.tomo();
	}
}


