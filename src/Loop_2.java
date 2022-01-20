
public class Loop_2 {

	public static void main(String[] args) {

		for (int i = 1; i < 51; i++) {
			if (i % 3 == 0) {
				System.out.println("짝");
				continue;
			}
			System.out.println(i);

		}
	}

}
