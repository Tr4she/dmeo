/*
 * 주어진 배열의 항목에서 최대값을 ㄱ해보세요
 * {1,5,3,8,2}
 * 결과값은 8
 */
public class StringExam1 {

	public static void main(String[] args) {

		int[] j = { -1, 5, 3, 8, 2 };
		int result = j[0];

		for (int i = 0; i < j.length; i++) {
			if (j[i] < result) {
				result = j[i];
			}

		}
		System.out.println(result);
	}

}
