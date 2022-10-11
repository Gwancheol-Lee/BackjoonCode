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

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Integer[] arr = new Integer[10];
		
		for (int i=0; i<arr.length; i++) {
			int x = Integer.parseInt(br.readLine());
			arr[i] = x%42;  			
		}
		
		Set<Integer> set = new HashSet<Integer>(Arrays.asList(arr));

		bw.write(String.valueOf(set.size()));
		br.close();
		bw.close();
	}
} 