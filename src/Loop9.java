
public class Loop9 {

	public static void main(String[] args) {

		char alphabet = 1;

		for (int a = 0; a < 26; a++) {

			System.out.println((char) (alphabet + 64));
			alphabet+= 1;
		}
		alphabet=1;
		for (int b = 0; b < 26; b++) {

			System.out.println((char) (alphabet + 96));
			alphabet+= 1;
		
	}
	}
}
