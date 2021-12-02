package day02;

public class BitOperator {
    public static void main(String[] args) {
        byte a= 5, b= 3;
        System.out.println(a & b); // & (비트곱) 각 자리수를 곱하기
        System.out.println(a | b); // | (비트합) 각 자리 수를 더하기, 단 1+1 = 1로 처리
        System.out.println(a ^ b); // ^ (배타적논리합) 다르면 1 같으면 0

        // 비트 이동 연산
        // 왼쪽 방향 이동 : 2의 이동 숫자 제곱만큼 곱하기
        // 오른쪽 방향 이동 : 2의 이동 숫자 제곱만큼 나누기
        int x = 192;
        System.out.println(x << 3);
        System.out.println(x >> 2);

        // 비트 반전
        int y = 8;                  // 0000 1000
        System.out.println(~y);     // 1111 0111
    }
}
