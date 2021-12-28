package day15.poly.casting;

public class Child extends Parent{
    @Override
    public void m2() {
        System.out.println("오버라이드 된 2번째 메서드");
    }
    public void m3(){
        System.out.println("3번째 메서드");
    }
}
