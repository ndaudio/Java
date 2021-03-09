
public class Fibonacci {

	public static void main(String[] args) {
		
		int x =0;
		int a = 1;
		int b = 0;
		int c;
		
		
		while (x<21) {
			c = a +b;
			System.out.println("Fib " +x + " = " +c );
			a = b;
			b = c;
			x++;
			
			//Check for values: 
			System.out.println("a= " +a);
			System.out.println("b= " +b);
			System.out.println("c= " +c);
		}
			
		
	}

}
