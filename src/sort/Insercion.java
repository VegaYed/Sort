package sort;

public interface Insercion {
	
	//ordenamiento por Insercion
	
	public static void Insercion(int array[]) {
		
		int aux,pos;
		
		for(int i=0;i<array.length;i++) {
			
			pos=i;
			aux=array[i];
			
			while((pos>0) && (array[pos-1] > aux)) {
				array[pos]=array[pos-1];
				pos--;
			}
			array[pos]=aux;
		}
		
	}

}
