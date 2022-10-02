import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String time = sc.nextLine();
		String[] arrStr = time.split(" ");
		int h = Integer.parseInt(arrStr[0]);
		int m = Integer.parseInt(arrStr[1]) - 45;
		
		if(m<0) {
			h--;
			m = 60 - (m * -1);
		}
		
		if(h<0) {
			h = 23;
		}
		
		System.out.println(h + " " + m);		
		sc.close();
	}
}