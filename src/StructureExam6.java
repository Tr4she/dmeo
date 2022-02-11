
/**
 * 성적처리프로그램
 * @author smart27
 *
 */
public class StructureExam6 {
	//멤버변수, 필드
		String stdName;
		int coding;
	
	public static void main(String[] args) {
		
		//int [] coding = new int[3];
		
		StructureExam6 [] se = new StructureExam6[3];
		
		StructureExam6  se0 = new StructureExam6();
		se0.stdName = "홍길동";
		se0.coding = 200;
		
		print(se0);
		

		StructureExam6 se1 = new StructureExam6();
		se1.stdName = "길동";
		se1.coding = 100;
		
		print(se1);
		

		StructureExam6 se2 = new StructureExam6();
		se2.stdName = "동";
		se2.coding = 300;
		
		print(se2);
		
		

	}

	private static void print(StructureExam6 se) {
		// TODO Auto-generated method stub
		System.out.println(se.stdName + " " + se.coding+"점");
	}

}
