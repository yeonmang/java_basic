package day02;
public class ConditionalOperator {
    public static void main(String[] args) {
        int x = -60;
        int abs = ( x>=0 ) ? x : -x;
        System.out.println("절댓값 = " + abs);
    }
}
