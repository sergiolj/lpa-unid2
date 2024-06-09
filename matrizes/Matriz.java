package matrizes;

public class Matriz {

	public static void main(String[] args) {
		int [] [] m=new int [10][5];
		for (int i=0; i<m.length;i++) { 
			/*
			 * m.length no caso de matriz é referente ao número de linhas, 
			pois a matriz é considerada um conjunto de vetores
			 */
			for (int j=0;j<m[i].length;j++) {
				/*
				 * No caso do Java a matriz pode ter linhas com número de colunas
				 * diferente por isso pode ser usado o i para a linha determinando o
				 * número de colunas
				 */
				System.out.print(m[i][j]+" ["+i+"] ["+j+"]");
			}
			System.out.println(" ");
			
			
		}

	}

}