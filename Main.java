package evento;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		EntradaNormal n=new EntradaNormal();
		EntradaVip v=new EntradaVip(n);
		Estadisticas es = new Estadisticas(n,v);
		
	}

}
