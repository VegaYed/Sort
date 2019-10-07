package evento;

import java.util.Scanner;

public class Estadisticas {
	
	/*
	 * 	2.	Cantidad de asistentes con entrada normal
	 	3.	Cantidad de asistentes con entradas VIP
		4.	Recaudación por entrada normal
		5.	Recaudación por entradas VIP
		6.	Recaudación Total
	 */	
	private int cantAsisNormal;
	private int cantAsisVip;
	private int cantAsisTotal;
	private int recaudacionNormal;
	private int recaudacionVip;
	private int recaudacionTotal;
	Scanner scanner = new Scanner(System.in);
	
	public Estadisticas(EntradaNormal normal, EntradaVip vip) {
		setCantAsisTotal();
		setCantAsisVip();
		setRecNormal(normal);
		setRecVip(vip);
		setRecTotal();
		print();
	}
	
	private void setCantAsisTotal() {
		System.out.print("Ingrese cantidad asistenes totales: ");
		cantAsisTotal=scanner.nextInt();
		scanner.nextLine();
	}
	private void setCantAsisVip() {
		System.out.print("Ingrese cantidad asistenes VIP: ");
		cantAsisVip=scanner.nextInt();
		scanner.nextLine();
		cantAsisNormal=cantAsisTotal-cantAsisVip;
	}
	
	private void setRecNormal(EntradaNormal normal) {
		recaudacionNormal=normal.getValor()*cantAsisNormal;
	}

	private void setRecVip(EntradaVip vip) {
		recaudacionVip=vip.getValor()*cantAsisVip;
	}
	
	private void setRecTotal() {
		recaudacionTotal=recaudacionNormal+recaudacionVip;
	}
	
	private void print() {
		System.out.print("1.	Total de asistentes: " + cantAsisTotal
				+ " 2.	Cantidad de asistentes con entrada normal: " + cantAsisNormal
				+ " 3.	Cantidad de asistentes con entradas VIP: " + cantAsisVip
				+ " 4.	Recaudación por entrada normal: " + recaudacionNormal
				+ " 5.	Recaudación por entradas VIP: " + recaudacionVip
				+ " 6.	Recaudación Total: " + recaudacionTotal);
	}
}
