import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int amount = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<>();
		String[] arrStr = br.readLine().split(" ");
		
		for (int i=0; i<amount; i++) {
			arr.add(Integer.parseInt(arrStr[i]));
		}
		
		Collections.sort(arr);
		
		bw.write(String.valueOf(arr.get(0))+ " " + String.valueOf(arr.get(arr.size()-1)));
		br.close();
		bw.close();
	}
} 