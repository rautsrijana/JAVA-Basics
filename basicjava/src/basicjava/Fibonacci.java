package basicjava;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1=0, a2=1, i , count = 10;
		int nextNum;
//		System.out.println(a1+"+a2");
		
		for (i=0; i<count; i++) {
			System.out.println(a1 + "");
			
			nextNum = a2 +a1;
			
			a1=a2;
			a2 = nextNum;
			
		}


	}

}
