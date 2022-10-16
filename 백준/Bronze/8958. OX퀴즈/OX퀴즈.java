import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
/*
 * 8958번 OX퀴즈 
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		int amount = Integer.parseInt(br.readLine());
		String[] arr = new String[amount];
		String[] splitArr = null;
		
		for (int i=0; i<amount; i++) {
			arr[i] = br.readLine();
		}
		
		for (int i=0; i<arr.length; i++) {
			int sum = 0;
			int	count = 0;
			splitArr = arr[i].split("");
			for (int j=0; j<arr[i].length(); j++) {
				if (splitArr[j].equals("O")) {
					sum += (count+1);
					count++;
				} else { 
					count = 0;
				}
			}
			bw.write(String.valueOf(sum) + "\n");
		}
		br.close();
		bw.close();
	}
} 