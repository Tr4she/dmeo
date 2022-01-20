
import java.time.LocalDateTime;

public class Loop5 {

	public static void main(String[] args) {
		for (;;) {
			LocalDateTime ldt = LocalDateTime.now();
			System.out.print(ldt.getHour() + ":");
			System.out.print(ldt.getMinute() + ":");
			System.out.println(ldt.getSecond());

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}

		}

	}

}
