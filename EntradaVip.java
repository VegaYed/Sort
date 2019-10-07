package evento;

import java.util.Scanner;

public class EntradaVip {
	
	private int valorEntrada;
	private int desc;
	private Scanner scanner = new Scanner(System.in);
	public EntradaVip(EntradaNormal normal) {
		setValor(normal);
	}
	
	public int getValor() {
		return this.valorEntrada;
	}
	
	public void setValor(EntradaNormal normal) {
		System.out.print("Ingrese descuento VIP: ");
		this.desc = scanner.nextInt();
		this.valorEntrada=normal.getValor()-((normal.getValor()*desc)/100);
		
		scanner.nextLine();
	}
}
