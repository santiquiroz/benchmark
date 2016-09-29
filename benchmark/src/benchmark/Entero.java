package benchmark;
public class Entero {
		public String sumaEntero (int enteros[]){
			//suma
			tiempo suma = new tiempo();
			int a=0;
			suma.start();
			for(int i =0;i<(enteros.length);i++){
				a+=enteros[i];
			}
			suma.stop();
			return suma.tomo();
		}
		public String restaEntero(int enteros[]){
			//resta
			tiempo resta = new tiempo();
			int b=0;
			resta.start();
			for(int i=0;i<=enteros.length;i++){
				b-=enteros[i];
			}
			resta.stop();
			return resta.tomo();
		}
		public String multiplicacionEntero(int enteros[]){
			//multiplicacion 
			tiempo multiplicacion =new tiempo();
			int c=enteros[0];
			multiplicacion.start();
			for(int i=1 ;i<=enteros.length;i++){
				c*=enteros[i];
			}
			multiplicacion.stop();
			return multiplicacion.tomo();
		}
		public String divisionEnteros(int enteros[]){
			//division
			tiempo division = new tiempo();
			int d = enteros[0] ;
			division.start();
			for ( int i=1; i<=enteros.length;i++){
				d/=enteros[i];
			}
			division.stop();
			return division.tomo();
		}

	}

