package passwordCheck;

public class NoNumbersException extends Exception {
	public NoNumbersException(String password) {
		System.out.println("Password needs at least one number. ");
		System.out.print(password + " ");
}
}