package collectiontest;

import java.util.PriorityQueue;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> que=new PriorityQueue<Integer>();
		que.add(11);
		que.add(10);
		que.add(22);
		que.add(5);
		que.add(12);
		que.add(2);
		while(que.isEmpty()==false)
			System.out.printf("%d",que.remove());
		System.out.println();

	}

}
