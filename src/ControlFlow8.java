
public class ControlFlow8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 가위바위보 가위1 바위2 보3

		int user1;
		int user2;

		user1 = (int)(Math.random()*3)+1;
		user2 = (int)(Math.random()*3)+1;
		
		
		
		System.out.print("user1=");
		if (user1 == 1) {
			System.out.println("가위");
		}
		else if (user1 == 2) {
			System.out.println("바위");
		}		
		else if (user1 ==3) {
			System.out.println("보");
		}
		System.out.print("user2=");
		if (user2 == 1) {
			System.out.println("가위");
		}
		else if (user2 == 2) {
			System.out.println("바위");
		}		
		else if (user2 == 3) {
			System.out.println("보");
		}

		if (user1 + 2 == user2 || user2 + 1 == user1) {
			System.out.println("이김");
		} else if (user2 + 2 == user1 || user1 + 1 == user2) {
			System.out.println("졌음");
		} else {
			System.out.println("비김");
		}

	}

}
