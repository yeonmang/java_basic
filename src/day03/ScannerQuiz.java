package day03;
import java.util.Scanner;

public class ScannerQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" *** 상품 재고 총액 구하기 ***");

        System.out.print("- 상품의 가격 : ");
        int price = sc.nextInt();

        System.out.print("- 상품의 개수 : ");
        int number = sc.nextInt();

        System.out.print("----------------------------\n");
        int total = price * number;

        System.out.printf("- 상품 재고 총액 : %d",total);

    }
}
