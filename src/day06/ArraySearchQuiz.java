package day06;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearchQuiz {
    public static void main(String[] args) {
        String[] member = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
        Scanner sc = new Scanner(System.in);

        System.out.println("* 변경 전 정보 : " + Arrays.toString(member));
        while (true) {
            System.out.println("수정할 멤버의 이름을 입력하세요 : ");
            System.out.print(" > ");

            String target = sc.nextLine();

            int index = -1;

            for (int i = 0; i < member.length; i++) {
                if (target.equals(member[i])) {
                    index = i;
                    break;
                }
            }
            if (index == -1) {
                System.out.println(target + "은(는) 없는 이름입니다.");
            } else {
                System.out.println(member[index] + "의 별명을 변경합니다 ");
                System.out.print(" > ");

                String newName = sc.nextLine();
                member[index] = newName;
                System.out.println("변경 완료 !");
                System.out.println("* 변경 후 정보 : " + Arrays.toString(member));
                break;
            }
        }
    }
}
