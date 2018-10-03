package sort;

public class Main implements BurbujaSimple{

	public static void main(String[] args) {
		
		int array[]=new int[5];
		array[0]=1;
		array[1]=2;
		array[2]=3;
		array[3]=5;
		array[4]=4;
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		//BurbujaSimple.SortburbujaSimple(array);
		//BubujaMejorada.SortBubblesort(array)
		//Insercion.SortInsercion(array);
		Seleccion.SortSeleccion(array);
		
		System.out.println("");
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		
	}

}
