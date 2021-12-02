package day02;

public class PlusMinusOperator {
    public static void main(String[] args) {

        int x = 10;
        x++;
        ++x;

        System.out.println("x = " + x);

        int a= 5;
        int b = a++; // 후위 연산 : 다른 연산보다 늦게 적용
        int c = ++b; // 전위 연산 : 다른 연산보다 먼저 적용
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        System.out.println("=========================");

        int n = 5, m = 3;
        int v = n++ * --m;
        System.out.println("n = " + n);
        System.out.println("m = " + m);
        System.out.println("v = " + v);

        System.out.println("=========================");

        int q = 3;
        int w = ++q + 5 * 3;
        int e = 5 * w-- + q++ - --w;

        System.out.println("q = " + q);
        System.out.println("w = " + w);
        System.out.println("e = " + e);




    }
}
