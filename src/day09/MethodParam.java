package day09;

import java.util.Random;

public class MethodParam {
    // 2개 정수를 받아서 그 합을 리턴해주는 함수 정의

    static int add2(int n1,int n2){
        return n1 + n2;
    }
    static String chooseRandomFood(){
        Random r = new Random();
        String[] foods = {"볶음밥", "치킨", "목살", "파스타"};
        int rn = r.nextInt(foods.length);
        return foods[rn];
    }

    //n 개의 정수를 전달 받아서 총합을 리턴하는 함수
    static int addAll(int[] numbers){
        int total = 0;
        for (int n : numbers) {
            total += n;

        }
        return total;
    }
    public static void main(String[] args) {
        byte x= 10;
        int r1 = add2(x, (int) 20.6);
        System.out.println("r1 = "+ r1);

        String food = chooseRandomFood();
        System.out.println("food = " + food);

        int[] arr = {1,3,5,7};
        int r2 = addAll(arr);
        System.out.println("r2 = " + r2);

        int r3 = addAll(new int[] {10,20,30,40,50});
        System.out.println("r3 = "+ r3);

    }
}
