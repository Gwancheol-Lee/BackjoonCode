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

		for (int i=1; i<=total; i++) {
			String star = "";
			for (int j=0; j<i; j++) {
				star += "*";				
			}
			bw.write(star+"\n");				
		}
		br.close();
		bw.close();
	}
}