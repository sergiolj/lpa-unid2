package matrizes;

import java.util.Random;
import java.util.Scanner;

public class DiagonalMatriz {

	public static void main(String[] args) {
		int n=0;
	Scanner input=new Scanner(System.in);
	int [][] m=new int [5][5];
	preenche(m,input);
	mostra(m);
	diagonal(m);
	System.out.print("Qual inteiro deseja contar? ");
	n=input.nextInt();
	busca(m,n);

	}
	
	public static void preenche(int [][] m, Scanner input) {
		Random aleat=new Random();
		for (int l=0;l<m.length;l++) {
			for (int c=0;c<m[l].length;c++) {
				m[l][c]=aleat.nextInt(10-1)+1;				
			}
		}
	}
	public static void mostra(int [][] m) {
		for (int l=0;l<m.length;l++) {
			for (int c=0;c<m[l].length;c++) {
				System.out.print(m[l][c]+" ");			
			}
			System.out.println(" ");
		}
	}
	public static void diagonal(int [][]m) {
		String space="";
		for(int lc=0;lc<m.length;lc++) {
			System.out.println(space+m[lc][lc]+" ");
			space+="  ";
		}
		System.out.println(" ");
	}
	public static void busca(int[][]m,int n) {
		int r=0;
		for (int l=0;l<m.length;l++) {
			for (int c=0;c<m[l].length;c++) {
				if(m[l][c]==n) {
					r+=1;
				}
			}
		}
		System.out.println(n+" : "+r);
	}
}
