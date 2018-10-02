package sort;

public interface BurbujaSimple {
	
	public static void burbujaSimple(int matriz[]) {
		
		int i,j;
		
		for(i=0;i<matriz.length-1;i++) {
			for(j=0;j<matriz.length-1;j++) {
				if(matriz[j]>matriz[j+1]) { //si el numero en el indice "j" es mayor a el numero en el indice "j+1"
					int temp=matriz[j];     //guarda el valor en una variable temporal
					matriz[j]=matriz[j+1];  //asiga el valor del indice "j+1" a indice "j"
					matriz[j+1]=temp;       //asiga el valor de la variable temp al indice "j+1"
				}
			}
			
			
		}
		
		
	}
	

}
