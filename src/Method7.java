
public class Method7 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i=1;
		int j=2;
		int res = 0;
		res = add(i,j); // 더하기
		System.out.println(i+"+"+j+"="+res);
	//	minus(i,j); // 빼기
	//	multiply(i,j); // 곱하기
	//	divide(i,j); // 나누기
	//	remainder(i,j); //나머지
		
	}

	private static int remainder(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println(i+"%"+j+"="+(i%j));
	return i%j;
	}

	private static int divide(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println(i+"/"+j+"="+(i/j));
		return i/j;
	}

	private static int multiply(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println(i+"x"+j+"="+(i*j));
		return i*j;
	}

	private static int minus(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println(i+"-"+j+"="+(i-j));
		return i-j;
	}

	private static int add(int i, int j) {
		// TODO Auto-generated method stub
		
		return i+j;
	}
}
