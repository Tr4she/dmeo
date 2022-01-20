import java.util.Scanner;

public class ControlFlow10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//if문
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("년차를입력하세요");
		int longevity = 0;
				
		do { System.out.println("usage:양수값을 입력하셔야합니다.");
			longevity = scan.nextInt();
		}	while(longevity<1);
		
		int longevityYear = longevity/12;
		if(longevity%12 >0)
		{longevityYear ++;}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
