package matrizes;

import java.util.Random;

public class Atv1 {

	public static void main(String[] args) {
		int[][] a= {{1, 5}, {3, 2}};
		int[][] b= {{4, 8}, {7, 0}};
		int[][] c;
		c=multiplica(a, b);
		mostra(c);
	}
	
	public static void preenche(int[][] m) {
		Random rand=new Random();
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[i].length; j++) {
				m[i][j]=rand.nextInt(10);
			}
		}
	}
	
	public static void mostra(int[][] m) {
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[i].length; j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static int[][] multiplica(int[][] a, int[][] b){
		int[][] c=new int[a.length][b[0].length];
		int soma;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b[0].length; j++) {
				soma=0;
				for(int x=0; x<b.length; x++) {
					soma+=(a[i][x]*b[x][j]);
				}
				c[i][j]=soma;
			}
		}
		
		return c;
	}

}