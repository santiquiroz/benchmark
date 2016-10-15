package benchmark;
public class Entero extends QuickSort{
		double timeDivide,timeMinus,timeMultiply,timePlus,timeQuickSort; 
		
		public void sacarTiempo(int a []) {
			
			 timeQuickSort(a);
			 sumaEntero(a);
			 restaEntero(a);
			 multiplicacionEntero(a);
			 divisionEnteros(a);
		}
		public void sumaEntero (int enteros[]){ 
			//suma
			tiempo suma = new tiempo();
			int a=0;
			suma.start();
			for(int i =0;i<(enteros.length);i++){
				a+=enteros[i];
			}
			suma.stop();
			timePlus= suma.tomo();
		}
		public void restaEntero(int enteros[]){
			//resta
			tiempo resta = new tiempo();
			int b=0;
			resta.start();
			for(int i=0;i<=enteros.length;i++){
				b-=enteros[i];
			}
			resta.stop();
			timeMinus = resta.tomo();
		}
		public void multiplicacionEntero(int enteros[]){
			//multiplicacion 
			tiempo multiplicacion =new tiempo();
			int c=enteros[0];
			multiplicacion.start();
			for(int i=1 ;i<=enteros.length;i++){
				c*=enteros[i];
			}
			multiplicacion.stop();
			timeMultiply= multiplicacion.tomo();
		}
		public void divisionEnteros(int enteros[]){
			//division
			tiempo division = new tiempo();
			int d = enteros[0] ;
			division.start();
			for ( int i=1; i<=enteros.length;i++){
				d/=enteros[i];
			}
			division.stop();
			timeDivide= division.tomo();
		}
		public void timeQuickSort(int e[]){
			timeQuickSort=tiempoQuickSort(e, 0,e.length-1 );
		}

	}

