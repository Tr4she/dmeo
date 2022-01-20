/*
 * 2022년 1월달  일자를 본인의 생년까지 반복해서 출력해보세요
 */
public class Loop3 {

	public static void main(String[] args) {

		int i; // 일자
		int j; // 개월
		int k=0; // 개월별 일자

		for (j = 1; j < 13; j++) {
			System.out.print(j + "월 ");
			switch (j) {
			case 1:
				k=31;
				break;
			case 2:
				k=28;
				break;
			case 3:
				k=31;
				break;
			case 4:
				k=30;
				break;
			case 5:
				k=31;
				break;
			case 6:
				k=30;
				break;
			case 7:
				k=31;
				break;
			case 8:
				k=31;
				break;
			case 9:
				k=30;
				break;
			case 10:
				k=31;
				break;
			case 11:
				k=30;
				break;
			case 12:
				k=31;
				break;

			default:
				break;
			}
			for (i = 1; i <k+1; i++) {

				System.out.print(i + " ");

			}
			System.out.println();

		}

	}

}
