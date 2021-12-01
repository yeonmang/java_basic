package day01;

public class Casting1 {
    public static void main(String[] args) {

        // 암시적 형변환 (uncasting, promotion)

        byte a =100; // 1바이트
        int b = a;
        double a3, a4,a5 = 0;
        double a1 = 119.97600480, a2 = 8335;
        double b1 = 134.30701198, b2 = 9937;

        a3 = a1 * a2;
        a4 = b1 * b2;
        a5 = (a3 + a4) /2;
        System.out.println(a5);
    }
}
