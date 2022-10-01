import java.util.*;
public class Main {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int intA, intB;
        intA = sc.nextInt(); // 472
        intB = sc.nextInt(); // 385
        String strB = Integer.toString(intB); // Int -> String 형변환
        StringBuffer sb = new StringBuffer(strB); // StringBuffer에 strB 데이터 주입
        strB = sb.reverse().toString(); // StringBuffer reverse 메소드 사용 "385" -> "583"
        int[] arrB = new int[3]; // "583" 담을 int형 배열 선언
				
        // strB 형변환 후 arrB 배열에 담기
        for(int i=0; i<strB.length(); i++) {
        	arrB[i] = Integer.parseInt(strB.substring(i, i+1)); // [5,8,3] 
	        System.out.println(intA * arrB[i]); // intA 차례로 곱하기
	    } 
        System.out.println(intA * intB);
        sc.close();
	}

}
