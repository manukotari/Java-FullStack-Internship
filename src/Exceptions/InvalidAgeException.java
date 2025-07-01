package Exceptions;

public class InvalidAgeException extends RuntimeException{
	public InvalidAgeException(String message) {
		super(message);
	}
	public void concert(int age) {
		try {
			if(age<18) {
				throw new InvalidAgeException("age should be greater then 18");
			}
			System.out.println("allowed");
		}
		catch (InvalidAgeException e) {
			// TODO: handle exception
			System.out.println("error occured"+ e.getMessage());

		}
	}
}