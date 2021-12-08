package day05;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPushQuiz {
    public static void main(String[] args) {
        String[] sArr;
        System.out.println("# 먹고 싶은 음식을 입력하세요 !! ");
        System.out.println("# 입력을 중지하려면 <그만> 이라고 입력하세요. ");
        Scanner sc = new Scanner(System.in);
        String[] foodlist = {};

        while (true){
            System.out.print("> ");
            String newFood = sc.nextLine();
            if (newFood.equals("그만")) break;

            // 배열에 신규 데이터가 들어갈 공간 확보
            String[] temp = new String[foodlist.length+1];

            // 기존 데이터 복사
            for (int i = 0; i < foodlist.length; i++) {
                temp[i] = foodlist[i];
            }
            // 신규 데이터 마지막 인덱스에 추가
            temp[temp.length-1] = newFood;
            foodlist = temp; temp= null;
        }
        System.out.println("먹고 싶은 음식 리스트 : " + Arrays.toString(foodlist));
        sc.close();
    }

}

