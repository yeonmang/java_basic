package day12.encap;

public class Car {

    private String model; // 모델명
    private int speed; // 현재 속도
    private char mode; // 변속 모드(D, N, R, P)
    private boolean start; // 시동 온오프 상태

    public Car(String model){
        this.model = model;
        this.mode = 'P';
    }
    //속도값 얻기
    //getter: private으로 된 필드 값을 참조하기 위한 메소드
    public int getSpeed(){
        return speed;
    }

    public String getModel() {
        return model;
    }

    // 변속 모드 설정 기능
    //setter : 필드가 private으로 감춰져있을 때 필드 값을 변경해주는 메소드드
   public void setMode(char mode){
        switch (mode){
            case 'D': case 'R': case 'N': case 'P':
                System.out.println("변속 모드가 "+mode+"로 정상 변경됩니다.");
                this.mode = mode;
                break;
            default:
                System.out.println("잘못된 변속 설정입니다. P모드로 자동 설정합니다.");
                this.mode = 'P';
        }

    }

    // 가속 기능
    public void accelerator(){
        if(this.mode != 'D'){
            System.out.println("변속 모드를 D로 설정하세요!");
            return;
        }
        if (this.speed >= 200){
            this.speed = 100;
            System.out.println("과속은 위험합니다.");
            return;
        }
        this.speed +=50;
        System.out.printf("현재 속도는 %dkm/h 입니다.\n",this.speed);
    }

    // 감속 기능
    public void slowdown(){
        this.speed -= 30;
        if (this.speed <= 0) this.speed =0;
        System.out.printf("현재 속도는 %dkm/h입니다.\n",this.speed);
    }

    // 시동을 거는 기능 ( 시동 버튼을 누름 )
    public void engineStart(){
        System.out.println("시동 버튼을 눌렀습니다.");
        injectOil();
        injectGasoline();
        this.start = true;
        moveCylinder();
    }
    // 연료가 엔진에 분사되는 기능
    private void injectGasoline(){
        System.out.println("연료가 엔진에 주입됩니다.");
    }
    // 엔진 오일이 순환하는 기능
    private void injectOil(){
        System.out.println("엔진 오일이 순환합니다.");
    }

    // 실린더가 작동하는 기능
    private void moveCylinder(){
        if (start){
            System.out.println("실린더가 움직입니다.");
        }
        else {
            System.out.println("차가 고장났습니다.");
        }
    }

}
