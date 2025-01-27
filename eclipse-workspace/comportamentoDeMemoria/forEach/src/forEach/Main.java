package forEach;

public class Main {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"Maria","Bob","Alex"};
		
		for(String obj:vect) { //O obj passa a assumir os valores de vect
			System.out.println(obj); 
		}
	}

}
