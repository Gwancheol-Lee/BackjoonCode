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
		
		ArrayList<Integer> arr = new ArrayList<>();
		int[] arr2 = new int[9];
		int a = 0;
		
		for (int i=0; i<9; i++) {
			int x = Integer.parseInt(br.readLine());
			arr.add(x);
			arr2[i] = x;  
					
		}
		
		Collections.sort(arr);
		
		for (int i=0; i<arr2.length; i++) {
			if (arr.get(arr.size()-1) == arr2[i]) a = i;
		}
		
		bw.write(String.valueOf(arr.get(arr.size()-1)) +"\n" + String.valueOf(a+1));
		br.close();
		bw.close();
	}
} 