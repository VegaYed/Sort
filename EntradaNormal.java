package evento;

import java.util.Scanner;

public class EntradaNormal {
	
	private int valor;
	private Scanner scanner = new Scanner(System.in);
	public EntradaNormal() {
		setValor();
	}
	
	public int getValor() {
		return this.valor;
	}
	
	public void setValor() {
		System.out.print("Ingrese valor entrada normal");
		this.valor = scanner.nextInt();
		scanner.nextLine();
	}
	
}
