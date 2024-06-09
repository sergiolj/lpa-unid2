package string;

public class Exemplo4 {

	public static void main(String[] args) {
		String p="Paralelepipedo";
		String cut="";
		String sub="pipe";
		System.out.println(p);
		System.out.println(sub);
		cut=cutter(p,sub);
		System.out.println(cut);
		
	}
	public static String cutter(String p, String sub) {
		int x,y;
		String result;
		x=p.indexOf(sub);
		y=x+sub.length();
		System.out.println(x+" "+y);
		result=p.substring(0,x)+p.substring(y,p.length());	
/*/O resultado será todo formado a partir da string principal
 a partir do indice 0, até (1-1) (Endindex -1) somado ao indice 4, até o final da string)
*/
	return result;	
	}
}
