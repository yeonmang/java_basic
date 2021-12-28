package day15.poly.casting;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.m1();
        parent.m2();

        System.out.println("=====================");

        Child child = new Child();
        child.m1();
        child.m2();
        child.m3();

        System.out.println("=====================");

        Parent upChild = new Child();
        System.out.println(upChild);

        upChild.m1();
        upChild.m2();

    }
}
