package course;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		boolean completed = false;
		char gener = 'F';
		char letter = '\u0041'; /*código unicode para letra A*/
		byte n1 = 126;
		int n2 = 1000;
		int n3 = 2147483647;
		long n4 = 2147483648L;
		float n5 = 4.5f;
		float cTeste = 5.0f;
		double n6 = 4.5;
		String numero = "33";

		Scanner sc = new Scanner(System.in);
		System.out.println(completed);
		System.out.println(gener);
		System.out.println(letter);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		System.out.println(n6);		
		
		cTeste = (float)n6;
		n2 = (int)n6;
		n6 = (double) n1/n2;
		System.out.println(cTeste);		
		System.out.println(n2);		
		System.out.println(n6);		
		
		n3 = Integer.parseInt(numero);
		System.out.println(n3);		
		n6 = Double.parseDouble(numero);
		System.out.println(n6);		

		sc.close();

	}

}
