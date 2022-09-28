import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int piece;
        int[] chessPiece = {1,1,2,2,2,8};
        int[] check = new int[6];
        
        for (int i=0; i<chessPiece.length; i++) {
            piece = sc.nextInt();
            check[i] = piece<=0 ? chessPiece[i]+piece : chessPiece[i]-piece;
            System.out.print(check[i] + " ");
        }
    }
}