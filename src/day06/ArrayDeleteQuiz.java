package day06;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {
    public static void main(String[] args) {
        String[] member = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
        Scanner sc = new Scanner(System.in);

        System.out.println("* 우리 반 학생들의 별명 : " + Arrays.toString(member));

        while (true) {
            System.out.println("- 삭제할 학생의 별명을 입력하세요 ! ");
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
                System.out.println("해당 별명("+target +")은 존재하지 않습니다.");
            } else {
                System.out.println(member[index] + "의 별명을 삭제합니다 ");

                for (int i = index; i < member.length-1; i++) {
                    member[i] = member[i+1];
                }
                String[] temp = new String[member.length-1];
                for (int i = 0; i < temp.length; i++) {
                    temp[i] = member[i];
                }
                member = temp; temp = null;
                System.out.println("* 삭제 후 정보 : " + Arrays.toString(member));
                break;
            }
        }
    }
}
