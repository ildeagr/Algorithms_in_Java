package Pruebas;


/* ****Este código cambia la hora de 12h a 24h**** */


public class Cambio_12h_24h {

	private static final Cambio_12h_24h Result = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "12:05:45AM";
		
		String result = Result.timeConversion(s);
		
		System.out.print(result);
	}

	public static String timeConversion(String s) {
	    // Write your code here
	    int hora = Integer.parseInt(s.substring(0,2));
	    String letra = s.substring(8,9);
	    String hora24 =s;
	    
	    switch(letra){
	    case "A":
	    	if(hora == 12) {
	    		hora-=12;		
	    	}
	    	hora24 = 0 + Integer.toString (hora)+s.substring(2,8);
	    	
	    break;
	    
	    case "P":
	    	if(hora != 12) {
	    		hora+=12;
	    	}
	    	hora24 =Integer.toString (hora)+s.substring(2,8);
	    break;
	    }    
		return hora24;
	    
	    }
	
	
}
