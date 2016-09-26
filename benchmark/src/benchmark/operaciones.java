package benchmark;
import java.io.*;
import benchmark.tiempo;
import java.util.ArrayList;
import benchmark.tiempo;
public class operaciones {
		public double entero (ArrayList <Integer> enteros){
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
			int c=enteros.get(1);
			multiplicacion.start();
			for(int i=1 ;i<=enteros.size();i++){
				c*=enteros.get(i);
			}
			multiplicacion.stop();
			multiplicacion.tomo();
			//division
			tiempo division = new tiempo();
			int d = enteros.get(1) ;
			division.start();
			for ( int i=1; i<=enteros.size();i++){
				d/=enteros.get(i);
			}
			division.stop();
			division.tomo();
		}
	}

