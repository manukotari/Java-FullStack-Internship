package Exceptions;

import abstraction.main;

public class Exceptions {
	public void division(int n1,int n2) {
		try {
			if(n2==0){
				throw new ArithmeticException("2nd number can't be zero");
			}
			int divresult=n1/n2;
			System.out.println("division result:"+divresult);
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("error occured"+ e.getMessage());
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("an error occured"+e.getMessage());
		}
	}
	public static void main(String[] args) {
		Exceptions excep=new Exceptions();
		
		excep.division(12,6);
	}
}
