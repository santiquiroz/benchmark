package benchmark;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class lectura{
	FileInputStream fr = null;
	ObjectInputStream or = null;
	int enteros[]=new int [1000000];
	int quickEnteros[]=new int [1000000];
	double doubles[]=new double[1000000];
	double quickDoubles[]=new double [1000000];
	tiempo lectura = new tiempo();
	double lecturaEnteros, lecturaQuickEnteros,  lecturaDoubles ,lecturaQuickDoubles;
	File arrayEnteros = new File("C://arrayEnteros");
	File arrayDoubles = new File("C://arrayDoubles");
	File arrayEnterosOrdenados = new File("C://arrayEnterosOrdenados");
	File arrayDoublesOrdenados = new File("C://arrayDoublesOrdenados");
	private double guardadoDoubles;
	private double guardadoEnteros;
	private double guardadoDoublesOrdenados;
	public int[] leerEnteros(){
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
	
	
	
	
	
	
	
	
	
	
	
	//guardado
	
public void guardarEnteros(int a[]){
		
	lectura.start();
	FileOutputStream fw = null;
	ObjectOutputStream ow = null;
	
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
		
		lectura.start();
		FileOutputStream fw = null;
		ObjectOutputStream ow = null;
		
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
	guardadoEnteros = lectura.tomo();
	lectura.reset();

	}
	public void guardarDoubles(double a[]){

		lectura.start();
		FileOutputStream fw = null;
		ObjectOutputStream ow = null;
		
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
			lectura.start();
			FileOutputStream fw = null;
			ObjectOutputStream ow = null;
			
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
}
