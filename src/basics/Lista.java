package basics;

public class Lista {

	public static void main(String[] args) {
	int[] lista = {1, 2, 5, 8, 4, 9, 10};
	System.out.println(min(lista));
	System.out.println(max(lista));
	System.out.println(ave(lista));
	}

	public static int min(int[] lista) {
		int i = lista.length;
		int a = 0;
		i = i - 1;
		int b = Integer.MAX_VALUE;
		while (a <= i) {
		if (b > lista[a]) {
			b = lista[a];
			a++;
			return b;
			}
		}
	return b;
}
	public static int max(int[] lista) {
		   int max = lista[0];
	       int i;
	        
	         for (i = 1; i < lista.length; i++)
	             if (lista[i] > max)
	                 max = lista[i];
	       
	         return max;
			
		
		}

		public static int ave(int[] lista) {
			int average = 0;
			int i;
			for (i = 0; i < lista.length; i++)
				average = lista[i] + average;
			average = average / lista.length;
				return average;
		}
	}
