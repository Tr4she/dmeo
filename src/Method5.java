
public class Method5 {

	public static void aaa(int i,char j) {
		// TODO Auto-generated method stub
		
		System.out.println("aaa()함수가 호출되었습니다."+(++i)+j);
		
		
	return;
	
	}
	private static int bbb(int i) {
		// TODO Auto-generated method stub
		i+=1;
		i = i+1;
		i++;
		return i;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i =24;
		i=bbb(i);
		System.out.println(i);
		
		
	}


	

}
