package string;

public class Exemplo2 {

	public static void main(String[] args) {
		String p="Exemplo";
		int col=0;
		for (int i=0;i<p.length();i++) {
			col+=1;
			for (int c=0;c<col;c++) {
				System.out.print(p.charAt(c));
			}		
			System.out.println(" ");
			}
		}
	}