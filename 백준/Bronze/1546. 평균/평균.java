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
		StringTokenizer st = null;
		
		int amount = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<Integer>();
		double maxScore=0, sum=0, average=0;
		
		// 점수 배열에 담기
		String[] scoreArr = br.readLine().split(" ");
		
		// Integer List에 옮겨 담기
		for (int i=0; i<amount; i++) {
			arr.add(Integer.parseInt(scoreArr[i]));
		}
		
		// Collection.sort 메소드 사용 -> 점수 정렬
		Collections.sort(arr);
		
		// 최고 점수값 구하기
		maxScore = arr.get(arr.size()-1);
		
		// 모든 점수 기존점수/최고점수*100
		for(double a : arr) {
			a = (a/maxScore)*100;
			sum+=a;
		}
		
		bw.write(String.valueOf(sum/amount));
		br.close();
		bw.close();
	}
} 