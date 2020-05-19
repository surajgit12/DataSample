package collectiontest;

import java.util.HashSet;

public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Object> hm=new HashSet<Object>();
		String s1=new String("Chicago");
		String s2=new String("Chicago");
		country s3=new country("USA");
		country s4=new country("USA");
		hm.add(s1);
		hm.add(s2);
		hm.add(s3);
		hm.add(s4);
		System.out.println(hm);



		

	}

}
class country
{
	private String name;

	public country(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "country [name=" + name + "]";
	}
	
}