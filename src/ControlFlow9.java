
public class ControlFlow9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 몇년차 계산 연차 몇일?
		int i; // 개월
		int j; // 년
		int k; // 연차수
		i = 12*20; // 개월수?
		j = 1 + ((i - 1) / 12); // 년수?
		switch (j) {
		case 1:
			k = 11;
			break;
		case 2:
			k = 15;
			break;
		case 3:
			k = 16;
			break;
		case 4:
			k = 16;
			break;
		case 5:
			k = 17;
			break;
		case 6:
			k = 17;
			break;
		case 7:
			k = 18;
			break;
		case 8:
			k = 18;
			break;
		case 9:
			k = 19;
			break;
		case 10:
			k = 19;
			break;
		case 11:
			k = 20;
			break;
		case 12:
			k = 20;
			break;
		case 13:
			k = 21;
			break;
		case 14:
			k = 21;
			break;
		case 15:
			k = 22;
			break;
		case 16:
			k = 22;
			break;			
		case 17:
			k = 23;
			break;
		case 18:
			k = 23;
			break;
		case 19:
			k = 24;
			break;
		case 20:
			k = 24;
			break;
		
		default:
			k = 25;
			break;
		}
		System.out.println(k);

	}

}
