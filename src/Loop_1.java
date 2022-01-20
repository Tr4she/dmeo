import java.util.HashSet;

/*
 * 로또 프로그램
 */
public class Loop_1 {

	public static void main(String[] args) {

	
		HashSet<Integer> hs = new HashSet<Integer>();
		while (true) {

			hs.add((int) (Math.random() * 45) + 1);
			System.out.println((int) (Math.random() * 45) + 1);

			if (hs.size() == 6) {
				break; // 반복문을 빠져나온다.
			}

		}//2022-01-15일 로또 1등번호 6개 출력
System.out.println(hs);
	}

}
