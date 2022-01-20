/*
 * for문 
 * 현재시간을 출력해보세요
 */
public class Loop4 {

	public static void main(String[] args) {

		int sec = (60*60*14)+(60*32);

	/*System.out.println(sec); //전체초
	System.out.println((sec)/(60*60)); //시
	System.out.println(((sec)%(60*60))/60); //분
	System.out.println((((sec)%(60*60))%60%60)); //초*/
		for(;;) {
			
			sec++;

			System.out.print((sec)/(60*60)+"시"); //시
			System.out.print(((sec)%(60*60))/60+"분"); //분
			System.out.println((((sec)%(60*60))%60%60)+"초"); //초
			
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		
		
		
		
		
		
		
		
		
		
		}
		
		

		
		
		
		
	}

}
