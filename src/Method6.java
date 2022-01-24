
public class Method6 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i=1;
		int j=2;
		
		add(i,j); // 더하기
		minus(i,j); // 빼기
		multiply(i,j); // 곱하기
		divide(i,j); // 나누기
		remainder(i,j); //나머지
		
	}

	private static void remainder(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println(i+"%"+j+"="+(i%j));
		
	}

	private static void divide(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println(i+"/"+j+"="+(i/j));
		
	}

	private static void multiply(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println(i+"x"+j+"="+(i*j));
		
	}

	private static void minus(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println(i+"-"+j+"="+(i-j));
	}

	private static void add(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println(i+"+"+j+"="+(i+j));
	}
}
