package outroTopicosBasicos;

public class Main {

	public static void main(String[] args) {
		//operações bit a bit
		
		int n1 = 89;
		int n2 = 60;
		
		System.out.println(n1 & n2); // e
		System.out.println(n1 | n2); // ou
		System.out.println(n1 ^ n2); // ou exclusivo
		
		//funções interessantes para strings
		
		String original = "abcd FGHIJ ABC abc DEFG   ";
		
		System.out.println(original.toLowerCase());
		
		System.out.println(original.toUpperCase());
		
		System.out.println(original.trim());
		
		System.out.println(original.substring(2));
		
		System.out.println(original.substring(2,9));
		
		System.out.println(original.replace('a','X'));
		
		System.out.println(original.replace("abc","X"));
		
		System.out.println(original.indexOf("bc"));
		
		System.out.println(original.lastIndexOf("bc"));
		
		String s = "batata maça limão";
		
		String[] vect = s.split(" ");
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
	}

}
