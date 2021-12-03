package day03;
//1. 스캐너 라이브러리 임포트
import java.util.Scanner;
public class StdInput {
    public static void main(String[] args) {
        //2. 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);
        //3. 스캐너의 함수들을 사용하여 입력을 처리
        // next(), nextLine() : 문자열 입력처리, next()는 공백미포함, nextLine()은 포함
        // nextInt(), nextDouble(): 각각 정수, 실수 입력처리
        System.out.println("이름을 입력: ");
        String name = sc.next();
        System.out.println("나이를 입력 : ");
        int age = sc.nextInt();
        System.out.println("================================");
        System.out.printf("%s 님은 %d세 입니다. ", name, age);
        sc.close();
    }
}
