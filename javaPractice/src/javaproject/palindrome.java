package javaproject;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, sum = 0, temp;
		int n = 303;// It is the number variable to be checked for palindrome

		// Hold the number in temporary variable
		temp = n;
		// Temp Variables are also used for holding data temporarily just like a temp
		// table
		while (n > 0) {
			i = n % 10; // getting remainder // n%10=45.4
			sum = (sum * 10) + i; // 0+45.4= 45.4
			n = n / 10; // n/10= 45.4
		}
		if (temp == sum) // temp=n=45.4, sum=45.4
			// If both numbers are same, print palindrome number
			System.out.println("palindrome number");
		else
			System.out.println("not palindrome");
	}

}
