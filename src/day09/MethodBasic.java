package day09;
/*
1. 자바의 함수는 클래스 내부, 함수 외부에 정의합니다.
2. 함수의 호출은 메소드 내부에서만 가능합니다.
 */
public class MethodBasic {
        // 1 ~ x 까지의 총합을 구하는 함수 정의
        static void calcTotal(int x) {
            int total = 0;
            for (int n = 1; n <= x; n++) {
                total += n;
            }
        }

    public static void main(String[] args) {
    }
}
