package javaproject;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int i = 1234, reverse = 0;  
			while(i != 0)   
			{  
		   int remainder = i % 10;  
			reverse = reverse * 10 + remainder;  
			i = i/10;  
			}  
		System.out.println(reverse);  
		}  

	}


//number = 1234
//remainder = 1234 % 10 = 4
//reverse = 0 * 10 + 4 = 0 + 4 = 4
//number i = 1234 / 10 = 123