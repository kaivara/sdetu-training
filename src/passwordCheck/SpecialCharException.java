package passwordCheck;

public class SpecialCharException extends Exception {
		public SpecialCharException(String password) {
				System.out.println("Password needs at least one of these special characters: ! @ #" );
				System.out.print(password + " ");
				
	}
	

}
