package day03;

public class ForExample {
    public static void main(String[] args) {
        // 구구단 2단을 출력해야 한다.

        for (int line =1; line <= 9; line++) {
            System.out.printf("2 x %d = 2\n", line);
            line++;
        }
    }
}
