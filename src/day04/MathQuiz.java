package day04;

import java.util.Random;
import java.util.Scanner;

public class MathQuiz {
    public static void main(String[] args) {
        int win, lose = 0;
        System.out.println("~~~~~~~~~~ 재미있는 사칙연산 게임 ~~~~~~~~~~");
        System.out.println("[즐겁게 문제를 푸시다가 지겨우면 0을 누르세요 ~]");
        System.out.println("==========================================");
        System.out.println("------------ 난이도를 설정합니다 -----------");
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        int num3 = rn.nextInt(4);

        System.out.println("[ 1. 상 (1~100) | 2. 중 (1~50) | 3. 하 (1~20) ]");
        int level = sc.nextInt();

        if (level==1){
            int num1 = (int)(Math.random()*100)+1;
            int num2 = (int)(Math.random()*100)+1;
        }
        else if (level==2){
            int num1 = (int)(Math.random()*50)+1;
            int num2 = (int)(Math.random()*50)+1;
        }
        else if (level==3){
            int num1 = (int)(Math.random()*20)+1;
            int num2 = (int)(Math.random()*20)+1;
        }
        int result = 0;

        switch (result) {
            case 0:
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = ? " ); break;
            case 1:
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = ? " ); break;
            case 2:
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = ? " ); break;
            case 3:
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = ? " ); break;
        }
        Scanner sc2 = new Scanner(System.in);
        int num = sc2.nextInt();

        if (num==result){
            win += 1;
        }
        else {
            lose += 1;
        }
    }
}