package array_session;

import java.util.Scanner;

public class array_2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size:");
		int size=sc.nextInt();
		int [] numbers=new int[size];
		System.out.println("enter the array elements");
		for(int i=0;i<numbers.length;i++) {
		numbers[i]=sc.nextInt();
		}
		System.out.println("************");
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		
	}
}
