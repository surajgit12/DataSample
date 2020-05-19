package collectiontest;

import java.util.HashSet;

public class A3 {
	String nm;

	public int hashCode()
	{
		return 31;
	}
	public boolean equals(Object o)
	{
		return true;
	}
	@Override
	public String toString() {
		return "A3 [nm=" + nm + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A3 obj=new A3();
		A3 obj1=new A3();
		obj.nm="John";
		obj1.nm="Martin";
		HashSet<A3> hm=new HashSet<A3>();
		hm.add(obj);
		hm.add(obj1);
		System.out.println(hm.size());
		System.out.println(hm);
		
	}

}
