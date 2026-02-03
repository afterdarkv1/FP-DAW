package tiempo;

public class Tiempo {
	private int hora;
	private int minuto;
	private int segundo;
	
	public Tiempo(int h, int m, int s) {
		if(h >= 0 && m >= 0 && s  >= 0) {
			this.hora = h;
			this.minuto = m;
			this.segundo = s;
		}else {
			System.out.println("no puede introducir valores negativos");
		}
		
	}
	public Tiempo(int h, int m) {
		if(h >= 0 && m >= 0) {
			this.hora = h;
			this.minuto = m;
		}else {
			System.out.println("no puede introducir valores negativos");
		}
		

	}
	public Tiempo(int h) {
		if(h >= 0) {
			this.hora = h;
		}else {
			System.out.println("no puede introducir valores negativos");
		}
	
	}
	public void modificarHora(int h) {
		this.hora = h;
	}
	public void modificarMinuto(int m) {
		this.minuto = m;
	}
	public void modificarSegundo(int s) {
		this.segundo = s;
	}

	public String toString() {
		return "hora = "+ hora +" minutos = "+ minuto + " segundos = "+ segundo;
	}

}
