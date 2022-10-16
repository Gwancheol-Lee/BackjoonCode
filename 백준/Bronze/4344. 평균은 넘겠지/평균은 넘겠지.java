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
 * 4344번 평균은 넘겠지
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		int c = Integer.parseInt(br.readLine());
		String[] arr = new String[c];
		String[] splitArr = null;
		
		for (int i=0; i<c; i++) {
			arr[i] = br.readLine();
		}
		
		for (int i=0; i<arr.length; i++) {
			int sum = 0;
			int avg = 0;
			int cnt = 0;
			double result = 0;
			splitArr = arr[i].split(" ");
			
			for (int j=1; j<splitArr.length; j++) {
				sum += Integer.parseInt(splitArr[j]);
			}
			
			avg = sum / Integer.parseInt(splitArr[0]);
			
			for (int k=1; k<splitArr.length; k++) {
				if (Integer.parseInt(splitArr[k]) > avg) {
					cnt++;
				}
			}
			
			result = ((double)cnt / Integer.parseInt(splitArr[0])) * 100;
			
			bw.write(String.format("%.3f%%", result) + "\n");
		}
		
		br.close();
		bw.close();
	}
} 