package Pruebas;


/* ****Este código indica las veces que se repite la moda **** */

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class La_Moda {

	private static final La_Moda Result = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> candles= new ArrayList();
		
		//Damos valores al array List 
		candles.add(1);
		candles.add(5);
		candles.add(1);
		candles.add(7);
		candles.add(7);
		candles.add(4);
		candles.add(1);
		candles.add(1);
		candles.add(8);
		candles.add(9);
		
		/*int result = Result.Busqueda1(candles);
		System.out.println(result);
		
		int result2 = Result.Busqueda2(candles);
		System.out.println(result2);*/

		int result3 = Result.Busqueda3(candles);
		System.out.print(result3);
	}

	
	
	//Solucion 1
	public static int Busqueda1(List<Integer> candles) {
	    // Write your code here
	    int result;
	    int veces =0;
	    List<Integer> moda = new ArrayList();
	    
	            for(int j=0; j<candles.size(); j++){
	            for(int i=0; i<candles.size(); i++){
	               if(candles.get(j).equals(candles.get(i))){veces++;}
	                }
	                moda.add(veces);
	                veces=0;
	            }
	            result = Collections.max(moda);

	    return result;
	}
	
	
	//Solucion 2
	public static int Busqueda2(List<Integer> candles) {
	    // Write your code here
	    int veces =0;
	    int moda=0;
	    int numero;
	    
	    for(int i : candles) {
			System.out.print(candles.get(i));
		}
	    System.out.print("\n");
	    
	    
	    while(candles.size()>0){
	    numero = candles.get(0);
          
	    for(int i=0; i<candles.size(); i++){
	          if(candles.get(i).equals(numero)){
	          veces++;
	          candles.remove(i);
	          i--;
	          }     
	      }     
	    if(moda<veces){moda=veces;}
	    veces=0;	        
	    }
	    return moda;
	}
	
	
	//Solucion 1
	//Esta solucion es la mas eficiente de todas
	public static int Busqueda3(List<Integer> candles) {

		Map<Integer, Integer> candlesCounts = new HashMap<>();
		int maxCount = 0;
		
		//Cuenta las ocurrencias de la lista generando mapa (Key, Value)
		for(int height : candles) {
			candlesCounts.put(height, candlesCounts.getOrDefault(height, 0) + 1);
		}
		
		//Encontramos el numero maximo de las ocurrencias en los valores de las claves
		
		for(int count : candlesCounts.values()) {
			maxCount = Math.max(maxCount,  count);
			
		}
		return maxCount;
	}
}
