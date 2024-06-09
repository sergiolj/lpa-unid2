package matrizes;

public class ListaExercicios11 {

	public static void main(String[] args) {
		int [][] m=new int [3][3];
		int [][] n=new int[4][4];
		//exercicio 1
		preencheOrdem(m);
		mostra(m);
		//exercicio 2
		System.out.println();
		preencheBinario(n);
		mostra(n);
		//exercicio 3
		System.out.println();
		preencheDiagonal(n);
		mostra(n);

	}
	public static void preencheOrdem(int [][]m) {
		int v=1;
		for(int c=0;c<m.length;c++) {
			for (int l=0;l<m.length;l++) {
				m[l][c]=v;
				v++;
			}
		}
	}
	public static void mostra(int [][]m) {
		for(int c=0;c<m.length;c++) {
			for (int l=0;l<m.length;l++) {
				System.out.print(m[c][l]);
			}
			System.out.println();
		}
	}
	public static void preencheBinario(int [][]m) {
		for(int c=0;c<m.length;c++) {
			for(int l=0;l<m.length;l++) {
				m[c][l]=l%2;
			}
			
		}
	}
	public static void preencheDiagonal(int [][]m) {
		for(int c=0;c<m.length;c++) {
			for(int l=0;l<m.length;l++) {
				if(c==l) {
					m[c][l]=0;
				}else {
					if(c>l) {
							m[c][l]=-1;
						}else {
							m[c][l]=1;
						}
				}
			}
		}
	}
}
