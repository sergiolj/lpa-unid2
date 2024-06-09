package string;

import java.util.Scanner;

public class ListaString {

	public static void main(String[] args) {
		String binario="001001001000";
		String palavra="avalanche";
		Scanner input=new Scanner(System.in);
		//exercicio1(input);
		//exercicio2(input);
		//exercicio3(input);
		//exercicio4(input,binario);
		//exercicio5(input);
		//exercicio6(input);
		//exercicio7(input);
		//exercicio8(input);
		exercicio9(input);
		
		
		
		}

	public static void exercicio1(Scanner input) {
		String n;
		System.out.println("Informe um nome");
		n=input.nextLine();
			if ((n.charAt(0)=='a')||(n.charAt(0)=='A')) {
				System.out.println(n);
				}else {
					System.out.println("Nome não inicia com letra a");
				}
	}
	public static void exercicio2(Scanner input) {
		String n;
		int count0=0;
		int count1=0;
		System.out.println("Digite um conjunto de zeros e uns Ex.(0001010101)");
		n=input.nextLine();
		for(int i=0;i<n.length();i++) {
			if (n.charAt(i)=='0') {
				count0++;
			}else {
				if (n.charAt(i)=='1') {
					count1++;
				}
			}
		}
		System.out.println("O número de zeros é ("+count0+") e o número de uns é ("+count1+")");
	}
	public static void exercicio3(Scanner input) {
		String p;
		char l;
		int count=0;
		System.out.println("Digite uma palavra");
		p=input.nextLine();
		System.out.println("Digite uma letra para contar");
		l=input.next().charAt(0);
		for (int i=0;i<p.length();i++) {
			if (p.charAt(i)==l) {
				count++;
			}
		}
		System.out.println(count);		
	}
	public static void exercicio4(Scanner input, String p) {
		String q="";
		System.out.println(p);
		for (int i=0;i<p.length();i++) {
			if(p.charAt(i)=='0') {
				q+='1';
			}else {
				q+='0';
			}
		}
		System.out.println(q);	
	}
	public static void exercicio5(Scanner input) {
		//De trás para frente
		String p;
		System.out.print("Digite uma palavra: ");
		p=input.nextLine();
		System.out.print("A palavra ao contrário fica: ");
		for(int i=p.length()-1;i>=0;i--) {
			System.out.print(p.charAt(i));			
			}
	}
	public static void exercicio6(Scanner input) {
		String p;
		char l1,l2;
		System.out.print("Digite uma palavra: ");
		p=input.nextLine();
		System.out.print("Digite a letra a buscar: ");
		l1=input.next().charAt(0);
		System.out.println("Digite a letra para substituir: ");
		l2=input.next().charAt(0);
		System.out.println(p.replace(l1,l2));
		String q=p.replace(l1,l2);
		System.out.println(q);
	}
	public static void exercicio7(Scanner input) {
		String p;
		int aux=0;
		System.out.print("Digite uma palavra: ");
		p=input.nextLine();
			for(int i=0;i<p.length();i++) {
				System.out.println(p.charAt(i));
			}
	}
	public static void exercicio8(Scanner input) {
		//conta espaços / palavras
		String f;
		int count=1;
		System.out.println("Digite uma sentença");
		f=input.nextLine();
		for(int i=0;i<f.length();i++) {
			if(f.charAt(i)==' ') {
				count++;
			}
		}
		if(count==1) {
			System.out.println("Sentença não é frase, pois só tem uma palavra");
		}
		System.out.println("A sentança possui "+count+" palavras");
	}
	public static void exercicio9(Scanner input) {
		String p;
		int aux=0;
		System.out.println("Digite uma palavra");
		p=input.nextLine();
		while(aux<p.length()) {
			for(int i=0;i<=aux;i++) {
				System.out.print(p.charAt(i));
			}
			System.out.println();
			aux++;
		}
	}
}
