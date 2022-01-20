
public class Operator4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 증감연산자 ++, --
		
		int i = 0;
		
	
		
		
		System.out.println(++i);
		System.out.println(i++);
		
		
		
		// 부정연산자  !
		
		boolean b = false;
		
		
		System.out.println(!b);
		
		
		// 비교연산자 >, >=, <, <=, ==, != 결과는 boolean타입으로 출력한다?
		
		int m=10, n=5;
		System.out.println(m != n);
		
		// 논리연산자 ( and [&&] , or [||], not[!] )
		
		
		System.out.println(false && false);
		System.out.println(true && false);
		System.out.println(true && true);
		System.out.println(false && true);
		
		
		System.out.println(false || false);
		System.out.println(true || false);
		System.out.println(true || true);
		System.out.println(false || true);
		
		System.out.println(!false);
		System.out.println(!true);
		
		
		// 비트연산자   &AND |OR ^XOR ~NOT << >> >>>
	    byte bitNum1 = 15;
		byte bitNum2 = 20;
		System.out.println(bitNum1 | bitNum2);
		System.out.println(bitNum1 & bitNum2);
		System.out.println(~bitNum2);
		System.out.println(bitNum1 ^ bitNum2);
		
		System.out.println(bitNum2 << 2);
		System.out.println(bitNum2 >> 2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
