
package benchmark;

import java.util.Scanner;
import benchmark.CreadorArreglos;

import org.hyperic.sigar.CpuInfo;
import org.hyperic.sigar.Mem;
import org.hyperic.sigar.OperatingSystem;
import org.hyperic.sigar.Sigar;
import org.hyperic.sigar.SigarException;
import org.hyperic.sigar.Swap;
import org.hyperic.sigar.SysInfo;

public class Main {
	
	public static void main(String[] args) {
		
		
				
		//sistema operativo
		OperatingSystem os=OperatingSystem.getInstance();
		//procesador
		
		
		Datos datos = new Datos();
		GestorDatos gestorDatos = new GestorDatos();
		
		Scanner input = new Scanner(System.in);
		
		datos = gestorDatos.leerDatos();
		if ( datos == null ) {
			gestorDatos.guardarDatos(datos);
			datos = new Datos();
			datos.initalizeMadeTests();
		}
		boolean b = false; int accion;
		if((datos.getDoublesArray()==null)){
			CreadorArreglos creadorArreglos = new CreadorArreglos();
			datos.enterosArray=creadorArreglos.getArrayEnteros();
			datos.enterosOrdenadosArray=creadorArreglos.getArrayEnterosOrdenados();
			datos.doublesArray=creadorArreglos.getArrayDoubles();
			datos.doublesOrdenadosArray=creadorArreglos.getArrayDoublesOrdenados();
		}
		 
		System.out.println("bienvenido a nuestro benchmark :v");
		
		do{ 
			System.out.println("");
			System.out.println("===== MENÚ DE CONSOLA =====");
			System.out.println("1. Ejecutar el benchmark");
			System.out.println("2. Comparar resultados");
			System.out.println("3. Salir");
			accion = input.nextInt();
			System.out.println("");
			
			if ( accion == 1 ) {	
				
				Entero entero = new Entero(datos.getEnterosArray());
				Entero eOrdenado = new Entero(datos.getEnterosOrdenadosArray());
				Double doble = new Double(datos.getDoublesArray());
				Double dOrdenado = new Double(datos.getDoublesOrdenadosArray());
				// resultados a variables
				String so =os.getVendor()+" "+os.getName()+" "+os.getVendorCodeName()+" "+os.getVersion()+" "+os.getArch();
				double teSort=eOrdenado.getTimeQuickSort(),se=entero.getTimeSuma(),re= entero.getTimeResta(),me= entero.getTimeMultiplicacion(),de=entero.getTimeDivision(),tdSort= dOrdenado.getTimeQuickSort(),
						sd= doble.getTimeSuma(),rd=doble.getTimeResta(),md=doble.getTimeMultiplicacion(),dd= doble.getTimeDivision(),atan= doble.getTimeAtan(),lectura=gestorDatos.getTiempoLectura(),guardado=gestorDatos.getTiempoLectura();
				//procesador
				String cpu = null,nucleos = null,cache = null;
				Mem ram=null;Swap intercambio=null;
				try {
					Sigar s=new Sigar();
					CpuInfo c[]=s.getCpuInfoList();
					   CpuInfo info=c[0];
					   ram= s.getMem();
					   intercambio=s.getSwap();
					 cpu = info.getVendor()+" "+info.getModel()+" "+info.getMhz()+"Mhz";
					 nucleos="nucleos totales "+info.getTotalCores();
					if(info.getCacheSize()!=-1){
						cache="tamaño total de cache"+" "+info.getCacheSize();
					}
					else{
						cache = "no tiene cache o no fue posible calcular";
					}
			    } catch (SigarException e) {
						   e.printStackTrace();
			    }
				//ram
			
				//regitrando los resultados
				datos.addTest("---- TEST NUMBER "+(datos.getMadeTests()+1)+" ----",so,cpu,nucleos,cache,ram,intercambio,teSort,se,re,me,de,tdSort,sd,rd,md,dd,atan,lectura,guardado);
				//guardando
				gestorDatos.guardarDatos(datos);
				
				//imprimiendo resultados inmediatos
				System.out.println("===== RESULTADOS DEL BENCHMARK =====  //  ===== BENCHMARK No. "+datos.getMadeTests()+" =====");
				System.out.println("-----INFO SISTEMA OPERATIVO-----");
				System.out.println(so);
				System.out.println("-----INFO PROCESADOR-----");
				System.out.println(cpu);
				System.out.println(nucleos);
				System.out.println(cache);
				System.out.println("-----INFO RAM-----");
				System.out.println(ram);
				System.out.println("-----INFO INTERCAMBIO-----");
				System.out.println(intercambio);
				System.out.println("Después de realizar cada una de las operaciones con un arreglo de " + CreadorArreglos.valorArray);
				System.out.println("de datos elegidos aletoriamente se obtuvo:");
				System.out.println("----- Tiempo de operaciones con enteros -----");
				System.out.println("Suma: " + se + " milisegundos");
				System.out.println("Resta: " + re + " milisegundos");
				System.out.println("Multiplicación: " + me + " milisegundos");
				System.out.println("División: " + de+ " milisegundos");
				System.out.println("Actividad de la CPU: " + (se+re+me+de) + " milisegundos");
				System.out.println("Actividad de la RAM (QuickSort): " + teSort + " milisegundos");
				System.out.println("----- Tiempo de operaciones con punto flotante -----");
				System.out.println("Suma: " + sd + " milisegundos");
				System.out.println("Resta: " +rd + " milisegundos");
				System.out.println("Multiplicación: " + md + " milisegundos");
				System.out.println("División: " + dd + " milisegundos");
				System.out.println("Arc tangente: " + atan+ " milisegundos");
				System.out.println("Actividad de la CPU: (punto flotante)" + (sd+rd+md+dd+atan) + " milisegundos");
				System.out.println("Actividad de la RAM (QuickSort): " + tdSort + " milisegundos");
				System.out.println("----- Tiempo de lectura y guardado -----");
				System.out.println("Lectura de datos (HDD): " + lectura+ " milisegundos");
				System.out.println("Guardado de datos (HDD): " + guardado + " milisegundos");
				
			
				
			}else if ( accion == 2 ) {
				System.out.println("===== COMPARACIÓN DE RESULTADOS =====");
				System.out.println("");
				for ( int i = 0; i < datos.getMadeTests(); i++ ) {
					System.out.println("===== BENCHMARK No. "+(i+1)+" =====");
					System.out.println("-----INFO SISTEMA OPERATIVO----- ");
					System.out.println(datos.getArquitectura(i));
					System.out.println("-----INFO PROCESADOR-----");
					System.out.println(datos.getCpu(i));
					System.out.println(datos.getCore(i));
					System.out.println(datos.getCache(i));
					System.out.println("-----INFO RAM-----");
					System.out.println(datos.getRam(i));
					System.out.println("-----INFO INTERCAMBIO-----");
					System.out.println(datos.getIntercambio(i));
					System.out.println("Después de realizar cada una de las operaciones con un arreglo de " + CreadorArreglos.valorArray);
					System.out.println("de datos elegidos aletoriamente se obtuvo:");
					System.out.println("----- Tiempo de operaciones con enteros -----");
					System.out.println("Suma: " + datos.getTimePlusEnteros(i) + " milisegundos");
					System.out.println("Resta: " + datos.getTimeMinusEnteros(i) + " milisegundos");
					System.out.println("Multiplicación: " + datos.getTimeMultiplyEnteros(i) + " milisegundos");
					System.out.println("División: " + datos.getTimeDivideEnteros(i) + " milisegundos");
					System.out.println("Actividad de la CPU: " + (datos.getTimePlusEnteros(i)+datos.getTimeMinusEnteros(i)+
							datos.getTimeMultiplyEnteros(i)+datos.getTimeDivideEnteros(i)) + " milisegundos");
					System.out.println("Actividad de la RAM (QuickSort): " + datos.getTimeQuickSortEnteros(i) + " milisegundos");
					System.out.println("----- Tiempo de operaciones con punto flotante -----");
					System.out.println("Suma: " + datos.getTimePlusDoubles(i) + " milisegundos");
					System.out.println("Resta: " + datos.getTimeMinusDoubles(i) + " milisegundos");
					System.out.println("Multiplicación: " + datos.getTimeMultiplyDoubles(i) + " milisegundos");
					System.out.println("División: " + datos.getTimeDivideDoubles(i) + " milisegundos");
					System.out.println("Arc tangente: " + datos.getTimeAtanDoubles(i) + " milisegundos");
					System.out.println("Actividad de la CPU: (punto flotante): " + (datos.getTimePlusDoubles(i)+datos.getTimeMinusDoubles(i)+
							datos.getTimeMultiplyDoubles(i)+datos.getTimeDivideDoubles(i)+datos.getTimeAtanDoubles(i)) + " milisegundos");
					System.out.println("Actividad de la RAM (QuickSort): " + datos.getTimeQuickSortDoubles(i) + " milisegundos");
					System.out.println("----- Tiempo de lectura y guardado -----");
					System.out.println("Lectura de datos (HDD): " + datos.getTimeLectura(i) + " milisegundos");
					System.out.println("Guardado de datos (HDD): " + datos.getTimeGuardado(i) + " milisegundos");
					System.out.println("");
				}
			}else if ( accion == 3 ) {
				//cargaLectura.eliminar();
				gestorDatos.guardarDatos(datos);
				System.out.println("Your PC is going to die");
				System.out.println("executing $hard-drive-rape.bat");
				System.out.println("Deleting System-32");
				System.out.println("Get Hacked M8");
				System.out.println("No te resistas e ingresa por el teclado el valor que estás dispuesto a pagar por recuperar tus archivos");
				input.next();System.out.println("");
				System.out.println("");
				System.out.println("");System.out.println("");
				System.out.println("");System.out.println("");
				System.out.println("");
				System.out.println("");System.out.println("");
				System.out.println("");
				System.out.println("");System.out.println("");
				System.out.println("");System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");System.out.println("");
				System.out.println("");System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");System.out.println("");
				System.out.println("");System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("Gracias por probar el benchmark");
				
				b=true;
			}
		}while ( b == false );
			
	}
	
}
