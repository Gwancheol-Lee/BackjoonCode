import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String[] arrStr = str.split(" ");
		int a = Integer.parseInt(arrStr[0]);
		int b = Integer.parseInt(arrStr[1]);
        
		if (a > b) {
			System.out.println(">");
		} else if (a < b) {
			System.out.println("<");
		} else if (a == b) {
			System.out.println("==");
		}
		
		sc.close();
	}

}