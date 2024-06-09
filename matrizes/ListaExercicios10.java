package matrizes;

import java.util.Scanner;

public class ListaExercicios10 {

	public static void main(String[] args) {
		int [] mlincol=new int[] {0,0,0,0};
		char maior=' ';
		//A multiplicação de matrizes é feita da seguinte maneira: cada coluna da primeira 
		//deve ser multiplicada pelas linhas da segunda matrix. Sendo matriz 1 m1(l1c1) x m2(l1c1) + m1(l1c2) x m2(l2c1)
		 Scanner input=new Scanner(System.in);
		//mlincol=defineMatriz(input);
		//int [][] a=new int[mlincol[0]][mlincol[1]];
		//int [][] b=new int[mlincol[2]][mlincol[3]];
		 int [][] a={{1,5},{3,2}};
		 int [][] b= {{4,8},{7,0}};
		 
		//insereValor(a,input);
	//	insereValor(b,input);
		calculaValor(a,b);
		
		


	}
	public static int [] defineMatriz(Scanner input) {
		int [] m=new int [4];
		do{
			System.out.println("O número de linhas das matrizes pode ser diferente, mas o de colunas tem que ser igual");
			System.out.println("Informe as dimenssões da matriz A");
			do {			
				System.out.print("Linhas (máx 20): ");
				m[0]=input.nextInt();	
			}while ((m[0]<2)||(m[0]>20));
			do {
				System.out.print("Colunas (máx 20): ");
				m[1]=input.nextInt();
			}while ((m[1]<2)||(m[1]>20));
			System.out.println("Informe as dimenssões da matriz B");
			do {
				System.out.print("Linhas (máx 20): ");
				m[2]=input.nextInt();
			}while ((m[2]<2)||(m[2]>20));
			do {
				System.out.print("Colunas (máx 20): ");
				m[3]=input.nextInt();
			}while ((m[3]<2)||(m[3]>20));
		}while(m[1]!=m[3]);
		return m;
	}
	
	public static void insereValor(int [][]a, Scanner input) {
		System.out.println("Insira valores para a matriz");
		for(int i=0;i<a[0].length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.print("L"+i+" C"+j+": ");
				a[i][j]=input.nextInt();
			}
		}
	}
	public static void calculaValor(int[][]a, int [][]b) {
		int [][] c=new int[2] [2];
		for(int i=0;i<a)
			mostra(a);
			mostra(b);
			mostra(c);
	}
	public static void mostra(int [][]m) {
		for(int c=0;c<m.length;c++) {
			for (int l=0;l<m.length;l++) {
				System.out.print(m[c][l]);
			}
			System.out.println();
		}
	}
}
