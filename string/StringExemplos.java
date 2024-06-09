package strings;

public class StringExemplos {

	public static void main(String[] args) {
		char x='e';
		String p1="Eu";
		String p2="tenho";
		String p3="a força!! Heman! kkkk";
		String palavra="Paralelepipedo";
		String frase="O rato roeu a roupa do rei";
		System.out.println(palavra.charAt(0));
		System.out.println(palavra.charAt(3));
		System.out.println(palavra.charAt(5));
		System.out.println(palavra.length());
		System.out.println();
		vertical(palavra);
		System.out.println();
		piramide(palavra);
		System.out.println();
		contaX(palavra,x);
		System.out.println();
		todasMinusculas(palavra);
		System.out.println();
		todasMaiusculas(palavra);
		System.out.println();
		subString(palavra);
		System.out.println();
		indiceChar(palavra);
		System.out.println();
		cutAndWeld(palavra,"Par");
		System.out.println();
		indiceUltimoChar(palavra);
		System.out.println();
		indiceUltimaSubstring(palavra);
		System.out.println();
		cortaFrase(frase);
		System.out.println();
		replaceCaracter(palavra);
		System.out.println();
		concatenarStrings(p1,p2,p3);
		
		
	}
	public static void vertical(String p) {
		for(int i=0;i<p.length();i++) {
			System.out.println(p.charAt(i));
		}
	}
	public static void piramide(String p) {
		int aux=1;
		while (aux<=p.length()) {
			for(int j=0;j<aux;j++) {
				System.out.print(p.charAt(j));
			}
			System.out.println();
			aux++;
		}
	}
	public static void contaX(String p, char x) {
		int count=0;
		for(int i=0;i<p.length();i++) {
			if (p.charAt(i)==x) {
				count++;
			}
		}
		System.out.println(count);
	}
	public static void todasMinusculas(String p) {
		System.out.println(p.toLowerCase());
	}
	public static void todasMaiusculas(String p) {
		System.out.println(p.toUpperCase());
	}
	public static void subString(String p) {
		String pcut;
		int inicio=2; int fim=5;
		pcut=p.substring(inicio,fim);
		System.out.println(p);
		System.out.println(pcut);
		System.out.println("note que o ínice inicial ("+inicio+") da substring é fechado, compõe a seleção, e o final ("+fim+") é aberto, ou seja, não faz parte da seleção");
	}
	public static void indiceChar(String p) {
		System.out.println(p);
		System.out.println("Ocorrência de primeiro caracter (p) na palavra");
		System.out.println(p.indexOf('p'));
		System.out.println("Ocorrência de primeiro caracter (p) na palavra a partir do indice 9 indexOf(String, int fromIndex)");
		System.out.println(p.indexOf('p',9));
	}
	public static void cutAndWeld(String p, String cut) {
		String pcortada;
		System.out.println("Corte a subtring ("+cut+") da palavra ("+p+")");
		int c=p.indexOf(cut);
		pcortada=p.substring(0,(0+c))+p.substring(c+cut.length(),p.length());
		System.out.println(pcortada);
	}
	public static void indiceUltimoChar(String p) {
		System.out.println(p.lastIndexOf('a'));
	}
	public static void indiceUltimaSubstring(String p) {
		System.out.println(p.lastIndexOf("pi"));
	}
	public static void cortaFrase(String f) {
		String frasecut;
		frasecut=f.substring(f.indexOf(' ')+1,f.lastIndexOf(' '));
		System.out.println(frasecut);
		System.out.println(f.substring(f.indexOf(' ')+1,f.lastIndexOf(' ')));
	}
	public static void replaceCaracter(String p) {
		System.out.println(p.replace('a', 'e'));
		System.out.println(p.replace("lele", "pipe"));
	}
	public static void concatenarStrings(String p, String q, String r) {
		String p4;
		p4=p.concat(" "+q).concat(" "+r);
		System.out.println(p4);
	}
	
}
