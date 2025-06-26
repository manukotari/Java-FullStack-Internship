package array_session;

import java.util.Scanner;


public class string_array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size:");
		int size=sc.nextInt();
		String [] fruitbasket=new String[size];
		System.out.println("enter the array elements");
		for(int i=0;i<fruitbasket.length;i++) {
			fruitbasket[i]=sc.next();
		}	
		System.out.println("************");
		for(int i=0;i<fruitbasket.length;i++) {
			System.out.println(fruitbasket[i]);
		}
	
	}
}
