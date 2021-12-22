package basics;

public class Harjoitus {
	public static void main(String[] args) {
		
	
	

System.out.println(palauta(4));
	
	}
	
	public static int palauta(int n) {
		
		if (n == 0) {
			return 0;
		}
		else {
	return (n + palauta(n - 1));
		}
	}
	}
   	



