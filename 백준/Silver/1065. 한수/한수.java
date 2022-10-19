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
 * 1065 한수
 */
public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		int a=0, b=0, c=0;
		
		for (int i=1; i<=n; i++) {
			if (i >= 100 && i <= 1000) {
				a = i/100;
				b = (i%100)/10;
				c = (i%100)%10;
				
				if (a-b == b-c) {
					cnt++;
				}
			}else {
				cnt++;
			}
		}
		bw.write(String.valueOf(cnt));
		br.close();
		bw.close();
	}
} 