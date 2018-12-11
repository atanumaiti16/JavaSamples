package basics;

public class reverse_string {

	public static String reverse(String S) {
		char[] buffer = S.toCharArray();
		
		String op= new String();
		
		for (int i=S.length()-1; i>=0; i--) {
			op=op+buffer[i];
			
		}
		
		return op;
		
		
	}
	
	public static void main(String args[]) {
		String x = "abcde";
		
		System.out.print(reverse(x));
	}
}
