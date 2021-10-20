package javaproject;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,fact=1;  
		  int number=4;//It is the number to calculate factorial    
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println(fact);    //"Factorial of "+number+" is: "
		 }  
	}


// fact = factorial
//number = factorial of number
// fact=fact*i (4*1=4, 4*2=8, 8*3=24) i.e 4*3*2*1=24