package Exceptions;

public class AgeValidator {
	 public void concert(int age) {
	        try {
	            if (age < 18) {
	                throw new InvalidAgeException("Age should be greater than 18");
	            }
	            System.out.println("Allowed to attend the concert");
	        } catch (InvalidAgeException e) {
	            System.out.println("Error occurred: " + e.getMessage());
	        }
	    }
	 public static void main(String[] args) {
	        AgeValidator validator = new AgeValidator();
	        
	        validator.concert(16); // Should trigger exception
	        validator.concert(20); // Should allow
	    }
}
