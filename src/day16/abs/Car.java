package day16.abs;


public abstract class Car {
    // 추상 메서드
    // 추상 메서드는 추상 클래스 내부에서만 선언 가능
    public abstract void speedDown();


    public void hearHandle(){
        System.out.println("핸들 열선 기능을 작동합니다.");
    }

    public final void powerHandle(){
        System.out.println("핸들을 파워 핸들로 사용합니다.");
    }
}
