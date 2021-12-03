package day03;

import java.util.Scanner;

public class LoopQuiz02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("양의 정수를 입력하세요 : ");
        int n = sc.nextInt();
        int [] num = new int[n];

        if (n<=0)
            System.out.println("양의 정수만 입력해주세요.");
        else
            System.out.printf("%d을(를) 거꾸로 읽으면 %d입니다.");
    }
}
