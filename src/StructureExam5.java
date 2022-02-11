
/**
 * 성적처리프로그램
 * 
 * @author smart27
 *
 */
class Person {
	 String name;
	 int age;
	 String address;
 }
public class StructureExam5 {
	// 멤버변수, 필드
	

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.name = "홍길동";
		p1.age = 30;
		p1.address = "서울시 용산구 한남동";
		System.out.printf("이름: %s%n",p1.name);
		System.out.printf("나이: %d%n",p1.age);
		System.out.printf("주소: %s%n",p1.address);
		
	}
}