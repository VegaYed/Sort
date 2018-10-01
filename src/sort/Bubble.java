package sort;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Bubble {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		
		int arr[],nElementos;
		
		nElementos=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementoss"));
		
		arr=new int[nElementos];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Posicion " + (i+1)+ " Digite un numero");
			arr[i]=in.nextInt();
		}
		
		//Método burbuja
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) { 	//si numeroActual es >a numero siguiente
				
					int aux= arr[j]; 	//en estas 3 lineas intercambiamos los valores
					arr[j]=arr[j+1];	//con ayuda de una variable auxiliar
					arr[j+1]=aux;
				}	
			}	
		}
		
		//imprimir de menor a mayor
		for(int i=0;i<arr.length;i++) {
			System.out.println(" "+ arr[i]);
		}
		
		System.out.println("");
		
		//imprimir de mayor a menor
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(""+arr[i]);
		}
		

	}

}
