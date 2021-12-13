package day09;
import java.util.Arrays;
public class MethodQuiz1 {
    static String[] foods = {"치킨", "파스타", "짬뽕"};

    static void remove(String tagetfood) {
        int index = -1;

        for (int i = 0; i < foods.length; i++) {
            if (tagetfood.equals(foods[i])) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("존재하지 않는 음식명입니다.");
        } else {
            System.out.println(foods[index] + "을 삭제합니다 ");

            for (int i = index; i < foods.length - 1; i++) {
                foods[i] = foods[i + 1];
            }
            String[] temp = new String[foods.length - 1];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = foods[i];
            }
            foods = temp;
            temp = null;
        }
    }

    static int indexOf(String food){
        int index = -1;
        for (int i = 0; i < foods.length; i++) {
            if (food.equals(foods[i])){
                index = i;
                break;
            }
        }
        return index;
    }

    static void push(String newFood){
        String [] temp = new String[foods.length +1];
        for (int i = 0; i < foods.length; i++) {
            temp[i] = foods[i];
        }
        temp[temp.length-1] = newFood;
        foods = temp;
    }

    public static void main(String[] args) {

        push("볶음밥");
        System.out.println(Arrays.toString(foods));

        push("라면");
        System.out.println(Arrays.toString(foods));

        System.out.println("=======================");

        // 1 리턴
        int idx1 = indexOf("파스타");
        System.out.println("idx1 = " + idx1);

        // 3 리턴
        int idx2 = indexOf("볶음밥");
        System.out.println("idx2 = " + idx2);

        // -1 리턴
        int idx3 = indexOf("망고");
        System.out.println("idx3 = " + idx3);

        remove("볶음밥");
        System.out.println(Arrays.toString(foods));// foods 배열에서 볶음밥 제거
        remove("망고"); // 존재하지 않는 음식명입니다
    }
}
