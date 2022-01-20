
public class Loop_3 {

	public static void main(String[] args) {

		int j = 0;
		int max = 20;

		for (int i = 1; i < max; i++) {
			if (i >= (max - 2) && i % 3 == 0) {

				System.out.print(i + "=");
				j += i;
			}

			else if (i % 3 == 0) {
				System.out.print(i + "+");
				j += i;
			}

		}
		System.out.print(j);

	}

}
