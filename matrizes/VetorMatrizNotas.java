package matrizes;

import java.util.Scanner;

public class VetorMatrizNotas {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String[] alunos=new String[5];
		Double[][] notas=new Double[5][4];
		preencheNomes(alunos, input);
		preencheNotas(alunos, notas, input);
		medias(alunos,notas);

	}
	public static void preencheNomes(String []a, Scanner input) {
		System.out.println("Digite o nome dos alunos");
		for (int i=0;i<a.length;i++) {
			a[i]=input.nextLine();
		}
	}
	public static void preencheNotas(String[] a, Double[][]n, Scanner input) {
		for (int i=0;i<a.length;i++) {
			System.out.println("Digite as notas do aluno "+a[i]);
			for (int j=0;j<n[j].length;j++) {
				System.out.print("Digite a nota "+(j+1)+": ");
				n[i][j]=input.nextDouble();
			}
		}
	}
	public static void medias(String[] a, Double[][]n) {
		//Double [] m=new Double[a.length];
		Double media=0.0;
		System.out.println();
		System.out.println("Médias dos alunos: ");
		for (int i=0;i<a.length;i++) {
			media=((n[i][0]+n[i][1]+n[i][2]+n[i][3])/4);
			System.out.println(i+"-"+a[i]+" teve média = "+media);
		}
	}
}
