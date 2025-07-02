package Exceptions;
import java.lang.*;
public class InvalidAgeException extends RuntimeException{
	public InvalidAgeException(String message) {
		super(message);
	}
	
}