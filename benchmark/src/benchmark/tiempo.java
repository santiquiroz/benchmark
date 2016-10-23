
package benchmark;

public class Tiempo {
	
	private double tiempoInicial;
	private double tiempoFinal;
	private boolean iniciado=false;
	
	public void start (){
		if(iniciado==true){
			throw new IllegalStateException("ya se habia iniciado");
		}else{
		
		
		tiempoInicial= System.currentTimeMillis();
		this.iniciado=true;
		}
	}

	public void stop() {
		if(iniciado==false){
			throw new IllegalStateException("no se ha iniciado");
		}else{
		tiempoFinal=System.currentTimeMillis();
		this.iniciado=false;
		}
	}

	public void reset() {
		tiempoFinal=0.0;tiempoInicial=0.0;		
	}
	
	public double tomo (){
		return (tiempoFinal-tiempoInicial);
	}
	
}
