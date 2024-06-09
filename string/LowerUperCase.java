 package string;

public class LowerUperCase {

	public static void main(String[] args) {

		String p="ExEmplO";
		String p1="Paralelepipedo";
		String p2;
		System.out.println("Palavra (p)");
		System.out.println(p);
		System.out.println("Palavra (p minúsculas) apenas formatação, sem mudar o original");
		System.out.println(p.toLowerCase());
		System.out.println("Palavra (p maiúsculas) apenas formatação, sem mudar o original");
		System.out.println(p.toUpperCase());
		//Seleciona uma parte da String com base no índice (inicial) e (final informado -1)
		p2=p.substring(0,3);
		System.out.println("Palavra p2 como substring de p formatada toUpperCase");
		System.out.println(p2.toUpperCase());
		System.out.println("Informa a posição do primeiro caracter (x) igual ao pesquisado -1 se não existir");
		//Informa a primeira ocorrência da letra a partir do índice 0
		System.out.println(p.indexOf('x'));
		//Informa a primeira ocorrência da letra após o indice informado -1 se não existir
		System.out.println(p1.indexOf('l',5));
		//Funciona com substrings também além de caracteres isolados
		System.out.println(p1.lastIndexOf('e'));
		System.out.println(p1.lastIndexOf("le"));
	}

}
