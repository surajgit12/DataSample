
public class Que_9 {

	public static void main(String[] args) {
		         
			int a=34;
			int b=21;
			int c=a++ + ++b;
			System.out.println("C="+c);
			int d=--a+--b+c--;
			System.out.println("D="+d);
			int e=a+ +b + +c+d--;
			System.out.println("E="+e);
			int f=-a+b--+-c-d++;
			System.out.println("F="+f);
			int sum=a+b+c+d+e+f;
			System.out.println("Sum="+sum);
	}
	}


