package Pruebas;

import java.util.*;

/* ****Imprimi un patrón en escalera con # segun el valor de n proporcionado **y alineado a la derecha** */

/* Ejemplo
 
 n=6 
 
     #
    ##
   ###
  ####
 #####
######

*/

public class Imprimir_escalera {

	private static final Imprimir_escalera Result = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		Result.staircase(n);
		
	}

	public static void staircase(int n) {
	    // Write your code here
	    List<List<String>> matriz = new ArrayList<>(n);
	    int LimiteX =n-1, LimiteY =n-2;
	    int numberOfLists = n;
	    
	        for (int i = 0; i < numberOfLists; i++) {
	            matriz.add(new ArrayList<>());
	        }
	        for(int j=0; j<n; j++){
	            for(int i=0; i<LimiteX; i++){
	            matriz.get(j).add(" ");
	            }
	          
	            for(int i=n-1; i>LimiteY; i--){
	            matriz.get(j).add("#");
	            }
	            
	            LimiteY--;
	            LimiteX--;
	        }
	    
	        for(int j=0; j<n; j++){
	            for(int i=0; i<n; i++){
	            System.out.print(matriz.get(i).get(j));
	            }
	            System.out.print("\n");
	        }
	    }
	
}


