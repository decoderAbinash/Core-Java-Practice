//Write a Java program to get a number from the user and print whether it is positive or negative.


import java.util.Scanner;

public class positiveOrNegative {

	public static void main(String[] args) {
		
		int Number;
	    Scanner sc = new Scanner(System.in);
		Number = sc.nextInt();
		sc.close();
		if(Number>=1)
			System.out.println("The Number Is Positive");
		else if(Number==0) 
			System.out.println("You Entered 0");
		else
			System.out.println("The Number Is Negetive");

	}

}
