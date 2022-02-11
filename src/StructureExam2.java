
/**
 * 성적처리프로그램
 * @author smart27
 *
 */
public class StructureExam2 {
	//멤버변수, 필드
	String stdName;
	int coding;
	
	public static void main(String[] args) {
		StructureExam2 se0 = new StructureExam2();
		se0.stdName = "홍길동";
		se0.coding = 200;
		print(se0.stdName, se0.coding);
		

		StructureExam2 se1 = new StructureExam2();
		se1.stdName = "길동";
		se1.coding = 100;
		
		print(se1.stdName, se1.coding);

		StructureExam2 se2 = new StructureExam2();
		se2.stdName = "동";
		se2.coding = 300; //멤버변수, 필드
		
		print(se2.stdName, se2.coding);
		
		
		

	}

	private static void print(String stdName , int coding) {
		// TODO Auto-generated method stub
		System.out.println(stdName+"의코딩성적은"+ coding+"점입니다");
	}

}
