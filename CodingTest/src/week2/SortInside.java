package week2; // https://www.acmicpc.net/problem/1427

import java.util.*;

public class SortInside {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자 입력하세요 (1 ~ 1,000,000,000)>");
        String[] number = scanner.next().split("");

        long start = System.currentTimeMillis();

        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < number.length; i++) {
            arr.add(Integer.valueOf(number[i]));
        }
        Collections.sort(arr, Collections.reverseOrder());

        long end = System.currentTimeMillis();

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + "");
        }
        System.out.println();
        System.out.println("수행시간: " + (end - start) / 1000 + "s");
    }
}
