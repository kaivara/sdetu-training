package passwordCheck;

public class NoAlphabetsException extends Exception {
		public NoAlphabetsException(String password) {
			System.out.println("Password needs at least one alphabets. ");
			System.out.print(password + " ");
			
		}
		
}
