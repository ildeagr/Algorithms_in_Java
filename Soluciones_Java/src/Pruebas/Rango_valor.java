package Pruebas;

/* ****Este código cuenta los numeros positivos, negativos e iguales a cero y calcula ña proporcion de cada uno mostrando 6 decimales**** */


import java.text.DecimalFormat;
import java.util.List;

public class Rango_valor {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	}
	    public static void plusMinus(List<Integer> arr) {
	    	
	    	//Damos valores al array List
	    	arr.add(-4);
	    	arr.add(3);
	    	arr.add(-9);
	    	arr.add(0);
	    	arr.add(4);
	    	arr.add(1);
	    	
	        double p=0, n=0, z=0;
	        
	        //Definimos un formato para indicar el número de decimales que deseamos mostrar
	        DecimalFormat df = new DecimalFormat("0.000000");
	        
	        for(int i=0; i<arr.size(); i++){
	            if(arr.get(i)<0){n+=1;}
	            else if(arr.get(i)==0){z+=1;}
	            else if(arr.get(i)>0){p+=1;}
	            }
	        
	        	//Imprimimos los resultados usando el formato de decimales definido
	            System.out.println(df.format(p/arr.size()));
	            System.out.println(df.format(n/arr.size()));
	            System.out.println(df.format(z/arr.size()));
	    }
	    
}

