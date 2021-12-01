package day01;

public class Casting3 {
    public static void main(String[] args) {
        char c = 'B';
        int i = 2;
        System.out.println(c + i);

        // 데이터 크기가 다른 연산은 작은 쪽을 큰 쪽으로 자동 변환하고 연산함

        char result = (char) (c+i);
        System.out.println(result);

        int n1 = 27, n2 = 5;
        double res = (double)n1 / n2;
        System.out.println("res = " + res);
    }
}
