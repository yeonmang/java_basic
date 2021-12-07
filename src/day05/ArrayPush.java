package day05;

public class ArrayPush {
    public static void main(String[] args) {
        int [] arr = {10,20,30};

        // 배열 데이터 추가 알고리즘
        int newData = 40;
        // 1. 원본 배열보다 사이즈가 1개 더 큰 새로운 배열 생성
        int[] temp = new int[arr.length +1];

        // 2, 원본 배열에 있던 기존 데이터를 전부 복사해서 새로운 배열로 이동
        for (int i = 0; i <arr.length; i++) {
            temp[i] = arr[i];
        }
        // 3. 신규 데이터를 마지막 인덱스에 추가
        temp[temp.length-1] = newData;

        arr = temp;
        temp = null;
    }
}
