import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		int total = Integer.parseInt(br.readLine());
		int space = total -1;
		
		for (int i=1; i<=total; i++) {

			for (int j=space; j>0; j--) {
				bw.write(" ");
			}
			for (int y=i; y>0; y--) {
				bw.write("*");
			}
			bw.write("\n");
			space--;
		}
		br.close();
		bw.close();
	}
}