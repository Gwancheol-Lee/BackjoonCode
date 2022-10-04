import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int cnt = sc.nextInt();
		int sum = 0;
		
		for (int i=0; i<cnt; i++) {
			int price = sc.nextInt();
			int amount = sc.nextInt();
            
			sum += price*amount;
		}
		System.out.println(total==sum ? "Yes" : "No");
		sc.close();
	}
}