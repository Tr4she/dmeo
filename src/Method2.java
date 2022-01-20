
public class Method2 {

	public static void aaa(int i) {
		// TODO Auto-generated method stub
		//int i; // 개월수

		//i = 3 * 12; // 몇개월차?
		if (i > 22 * 12) {
			i = 22 * 12;
		}

		System.out.println(14 + ((((i + 11) / 12) + 1) / 2));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stubol

		for(int i=1;i<23;i++) {
		aaa(i*12);
		}
		
	}

}
