package Pruebas;


/* ****Este código realiza la busqueda del max y min de una Lista**** */


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Busqueda_minmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Definidos la lista con sus valores
		List<Integer> arr = new ArrayList();
		
		//Damos valores al array List
    	arr.add(1);
    	arr.add(2);
    	arr.add(3);
    	arr.add(4);
    	arr.add(5);

		
		Busqueda_minmax result = null;
		result.miniMaxSum(arr);
		
	}
	
	
	public static void miniMaxSum(List<Integer> arr) {
	    // Write your code here
	    int suma=0;
	    int posi=0;
	    List<Integer> minmax = new ArrayList();

	    
	    //Realizamos la suma quitando un elemento cada vez
	    for(int j=0; j<arr.size(); j++){
	        for(int i=0; i<arr.size(); i++){
	           if(posi!=i){suma+=arr.get(i);}
	        }
	        minmax.add(suma);
	        suma=0;
	        posi++;
	    }
	    
	    
	    //Imprimimos la lista obtenida
	    for(int i=0; i<minmax.size(); i++){
            System.out.print(minmax.get(i) + " ");
            }
            System.out.print("\n");
	  
	    System.out.print(Collections.min(minmax) + " ");
	    System.out.print(Collections.max(minmax));
	    }

}
