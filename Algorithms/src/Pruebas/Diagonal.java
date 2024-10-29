package Pruebas;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Diagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<List<Integer>> arr = new ArrayList<>();
		
		int result = Diagonal.diagonalDifference(arr);
		
	}
	
	public static int diagonalDifference(List<List<Integer>> arr) {
	    // Write your code here
	        int D1 =0;
	        int D2 =0;
	        int resul;
	        int j =arr.size()-1;
	        
	        //Sum D1
	        for(int i=0;i<arr.size();i++){
	             D1+=arr.get(i).get(i);
	        } 
	        //Sum D2
	        for(int i=0;i<arr.size();i++){
	             D2+=arr.get(j).get(i);
	             j--;
	        } 
	        
	        resul = Math.abs(D1-D2);
	        return resul;
	    }

	}
