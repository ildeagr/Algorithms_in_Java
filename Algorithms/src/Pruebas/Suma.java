package Pruebas;

/* ****Este código recibe un número y saca por pantalla:
 * 
 * FizzBuzz si es divisible por 3 y 5
 * Fizz si es divisible por 3
 * Buzz si es divisible por 5
 * Y el propio número si no es divisible ni por 3 ni por 5
 * 
 */

public class Suma {

	public static void main(String[] args) {

		int n =20;
		
		for( int e=1; e<=n; e++)
		{
            if(e%3==0 && e%5==0){System.out.print("FizzBuzz\n" );}
            else if(e%3==0){System.out.print("Fizz\n");}
            else if(e%5==0){System.out.print("Buzz\n");}
            else {System.out.println(e);}
        }
		// TODO Auto-generated method stub

	}

}
