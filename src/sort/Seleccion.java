package sort;

public interface Seleccion {
	
	public static void SortSeleccion(int array[]) {
		
		int i,k,p,buffer,limite=array.length-1;
		
		for(k=0;k<limite;k++) {
			
			p=k;
			for(i=k+1;i<=limite;i++) {
				if(array[i]<array[p]) p=i;
			}
			if(p!=k) {
				buffer=array[p];
				array[p]=array[k];
				array[k]=buffer;
			}
			
		}
		
		
		/*for(int i=0;i>array.length-1;i++) {
			int vMinimo=i;
			for(int j=i;j>array.length;j++) {
				if(array[j]<array[vMinimo]) {
					vMinimo=j;
				}
			}
			int temp= array[i];
			array[i]=array[j];
			array[j]=temp;
		}*/
		
	}

}
