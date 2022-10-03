import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int time = sc.nextInt();
		String[] arrStr = str.split(" ");
		int h = Integer.parseInt(arrStr[0]);
		int m = Integer.parseInt(arrStr[1]) + time;

		if (m >= 60) {
			h += m/60;
			m = m % 60;
		}
		
		if (h > 23) {
			h = h - 24;
		}
		
		System.out.println(h + " " + m);		
		sc.close();
	}
}