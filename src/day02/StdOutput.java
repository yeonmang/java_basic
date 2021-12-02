package day02;

public class StdOutput {
    public static void main(String[] args) {

        String dog = "멍멍이";
        String cat = "야옹이";

        System.out.println(dog);
        System.out.println(cat);

        int month =12 , day = 25;
        String anni = "크리스마스";

        System.out.println(month +"월 " + day + "일은 " + anni + "입니다. ");
        System.out.printf("%d 월 %d 일은 %s 입니다",month,day,anni);

        double saleRate = 0.2532;
        System.out.printf("할인 비율 : %f \n" , saleRate); // %f는 강제로 소수점 6자리까지 표현
        System.out.printf("할인 비율 : .2%f%% \n" , saleRate*100); // %f는 강제로 소수점 6자리까지 표현

    }
}

