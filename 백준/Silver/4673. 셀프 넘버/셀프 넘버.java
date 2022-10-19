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
 * 4673 셀프 넘버
 */
public class Main {

	public static void main(String[] args) {
		
		int i, n, sum;
		String array[] = new String[10000];
		for(i = 0; i < array.length; i++) { array[i] = Integer.toString(i+1); }
		ArrayList<String>numbers = new ArrayList<>(Arrays.asList(array));
		
		for(i = 0; i < array.length; i++) {
			n = i + 1; sum = n;
			while(n > 0) {
				sum += n % 10;
				n = n / 10;
			}
			String num = Integer.toString(sum);
			numbers.remove(num);
		}
		
		for(String s : numbers) { System.out.println(s); }
	}
}