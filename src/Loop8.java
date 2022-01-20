/*
 * 피보나치수열을 출력하시오. 총 10번만 반복하세요.
 */

public class Loop8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sun = 1; // 1
		int sum = 0; // 0

		for (int a = 0; a < 4; a++) {

			System.out.print(sum + " ");
			System.out.print(sun + " ");

			sum += sun;
			sun += sum;

		}

	}

}
