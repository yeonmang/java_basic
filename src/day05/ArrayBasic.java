package day05;

import java.util.Arrays;

public class ArrayBasic {
    public static void main(String[] args) {
        // 1. 배열 선언
        int [] arr;

        // 2. 배열 생성
        arr = new int[5];
        System.out.println(arr);

        // 3. 배열 초기화
        arr[0] = 30;
        arr[1] = 99;
        arr[2] = arr[0]+20;
        arr[3] = (short) 66.7;
        arr[4] = 100;

        // 배열의 길이 - 총 공간 수
        System.out.println(arr.length);

        // 배열의 반복문 처리
        System.out.println("================================");
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("================================");

        // 향상된 for문(Enhanced for loop)
        for(int n : arr){
            System.out.println(n);

        }

        // 값 목록 나열로 배열 만들기
        // 생성 시 new int[] 는 선언시에만 생략 가능
        int[] numbers = {10,20,30,40};
        numbers = new int[] {1,3,5,7};

        String[] foods = {"사과", "자몽", "복숭아", "딸기"};
        System.out.println(Arrays.toString(foods)); // 배열 내부값 확인

        // 배열을 생성만하고 초기화하지 않았다면
        // -> 각 타입의 기본 값으로 자동 초기화
        long [] lArr = new long[3];
        System.out.println("lArr.length = "+ lArr.length);
        System.out.println(Arrays.toString(lArr));

        double[] dArr = new double[5];
        System.out.println(Arrays.toString(dArr));
    }
}
