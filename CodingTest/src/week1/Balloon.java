package week1; // https://www.acmicpc.net/problem/2346

import java.util.ArrayList;
import java.util.Scanner;

public class Balloon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        // 풍선 입력받기, 입력값 적으므로 scanner
        do {
            System.out.print("풍선 개수>");
            n = scanner.nextInt();
        } while (n < 1 | n > 1000);

        ArrayList<Integer> list = new ArrayList<>(n);

        // 숫자 입력받기, 입력값 많으므로 buffer
        boolean result = true;
        while (true) {
            System.out.print("숫자 " + n + "개 입력>");
            String str = scanner.next();
            String[] nums = str.split(" ");
            Integer[] arr = new Integer[nums.length];
            for (int i = 0; i < nums.length; i++) {
                list.add(Integer.parseInt(nums[i]));
            }
            System.out.println(list);

            if (list.size() == n) {
                break;
            }
        }
        /*while (true) {
            System.out.print("숫자 " + n + "개 입력>");
            String str = scanner.next();
            String[] numbers = str.split("\\s");
            for (int i = 0; i < numbers.length; i++) {
                list.add(Integer.parseInt(numbers[i]));
                System.out.println(numbers[i]);
            }
            if(list.size() == n){
                break;
            }
        }*/
        System.out.println("탈출 성공");
    }
}
