
public class test55 {
	int a,b;
	static int c;
	test55(float a,float b)
	{
		this.a=(int)a;
		this.b=(int)b;
		System.out.println("floataa="+a);
		System.out.println("floatbb="+b);
	}
	test55(long p,long q)
	{
		this((float)p,(float)q);
		a=(int)p;
		b=(int)q;
		System.out.println("longap="+a);
		System.out.println("longbq="+b);
	}
	/*test55(int p,int q)
	{
		a=p;
		b=q;
		System.out.println("Intap="+a);
		System.out.println("Intbq="+b);
	}*/
	test55(double p,double q)
	{
		a=(int)p;
		b=(int)q;
		System.out.println("doubap="+a);
		System.out.println("doubbq="+b);
	}
	public static void main(String args[])
	{
		test55 a=new test55(11,12);
	}

}
