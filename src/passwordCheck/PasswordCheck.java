package passwordCheck;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordCheck {

	public static void main(String[] args) {
		String filename = "/Users/jussi/eclipse-workspace/JavaTraining/src/files/passwords.txt";
		File file = new File(filename);
		ArrayList<String> passwords = new ArrayList<>();




		int i = 0;
		String password = null;


		//reading passwords to arraylist
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));

			String word = br.readLine();
			while (word != null) {
				passwords.add(word);
				word = br.readLine();
			}

			br.close();
		}

		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }

		for (i = 0; i < passwords.size(); i++) {

		try {
				password = passwords.get(i);

				Pattern p = Pattern.compile("[A-Za-z]");
				Matcher m = p.matcher(password);
				boolean find = false;

				if (p.matcher(password).find()) {       find = true;


					}

				if (!p.matcher(password).find())  {     find = false;


				throw new NoAlphabetsException(password);
				}
		}

			catch (NoAlphabetsException e) {
				System.out.println("Pitää olla vähintään yksi kirjain.");
			}


		try {

			Pattern p = Pattern.compile("[0-9]");
			Matcher m = p.matcher(password);
			boolean find = false;

			if (p.matcher(password).find()) {       find = true;


			}

			if (!p.matcher(password).find())  {     find = false;

			throw new NoNumbersException(password);
			}
	}

		catch (NoNumbersException e) {
			System.out.println("Pitää olla vähintään yksi numero.");
		}
		
		try {
			Pattern p = Pattern.compile("^[!|@|#]+$");
			Matcher m = p.matcher(password);
			boolean find = false;

			if (p.matcher(password).find()) {       find = true;


			}

			if (!p.matcher(password).find())  {     find = false;
			
			throw new SpecialCharException(password);
			
			}
		}
		catch (SpecialCharException e) {
			System.out.println("Pitää olla yksi seuravista merkeistä: !@#");
		}

		}
		}
		}













