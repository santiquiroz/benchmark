package benchmark;
public class tiempo {
	private double tiempoInicial;
	private double tiempoFinal;
	boolean iniciado=false;
	public void start (){
		if(iniciado==true){
			throw new IllegalStateException("ya se habia iniciado");
		}
		else{
		
		
		tiempoInicial= System.currentTimeMillis();
		iniciado=true;
		}
	}

	public void stop() {
		if(iniciado==false){
			throw new IllegalStateException("no se ha iniciado");
		}
		else{
		tiempoFinal=System.currentTimeMillis();
		}
		
	}

	public void reset() {
		tiempoFinal=0.0;tiempoInicial=0.0;		
	}
	public String tomo (){
		return "tomo: "+(tiempoFinal-tiempoInicial)+"milisigundos";
	}
	
}
