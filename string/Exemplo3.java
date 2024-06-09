package string;

import java.util.Scanner;

public class Exemplo3 {

	public static void main(String[] args) {
		char l=' ';
		int count=0;
		Scanner input=new Scanner(System.in);
		String p;
		System.out.println("Informe a palavra");
		p=input.nextLine();
		System.out.println("Informe a letra a ser contada (case sensitive)");
		l=input.next().charAt(0);
		for (int i=0;i<p.length();i++) {
			if (p.charAt(i)==l) {
				count+=1;
			}
			}
		System.out.println("A letra ("+l+") aparece ("+count+") vezes na palavra ("+p+")");
		}
	}