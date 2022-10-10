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
		
		String totalStr=null, argStr=null, sumStr=null;
		int sum=0, count=0, a=0, b=0;
		int total = Integer.parseInt(br.readLine());
		
		totalStr = Integer.toString(total);
		if (totalStr.length()<=1) totalStr = "0"+totalStr;
		
		while(!totalStr.equals(argStr)) {
			
			if (count==0) argStr = totalStr;
			
			a = Integer.parseInt(argStr.substring(0,1));
			b = Integer.parseInt(argStr.substring(1,2));
			
			sum = a + b;
			sumStr = Integer.toString(sum);			
			if (sumStr.length()<=1) sumStr = "0"+sumStr;
			
			argStr = Integer.toString(b) + sumStr.substring(1,2);
			count++;
		}
		bw.write(String.valueOf(count));
		
		br.close();
		bw.close();
	}
} 