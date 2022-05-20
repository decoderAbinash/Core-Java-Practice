import java.util.Scanner;

public class solveQuadraticEquation {

	public static void main(String[] args) {
		double a ;
		double b ;
		double c ;
		double result ;
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		result = -b+ Math.sqrt(b*b-4*a*c);
		result = result/2*a;
		System.out.println(result);
		result = -b-Math.sqrt(b*b-4*a*c);
		result = result/2*a;
		System.out.println(result);
		

	}

}

