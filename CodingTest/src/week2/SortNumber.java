package week2; // https://www.acmicpc.net/problem/2751

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("수 개수>");
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i < n; i++) {
            System.out.print("숫자 입력>");
            arr.add(sc.nextInt());
        }

        long start = System.currentTimeMillis();
        Collections.sort(arr);
        long end = System.currentTimeMillis();

        System.out.println("---결과---");
        for(int i = 0; i < n; i++) {
            System.out.println(arr.get(i));
        }

        System.out.println("수행시간: " + (end - start) / 1000 + "s");
    }
}
