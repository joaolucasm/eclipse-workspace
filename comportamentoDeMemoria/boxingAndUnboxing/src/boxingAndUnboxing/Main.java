package boxingAndUnboxing;

public class Main {

	public static void main(String[] args) {
		
		int x = 20;
		
		Object obj1 = x; //BOXING
		
		int y = (int) obj1;//UNBOXING
		
		System.out.println(y);
		
		int a = 20;
		
		Integer obj2 = a;//WRAPPER CLASS
		
		int b = obj2;
		
		System.out.println(b);
	}

}
