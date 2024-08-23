package week2_offline; // https://www.acmicpc.net/problem/1436

import java.util.Scanner;

public class Movie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("수 개수>");
        int n = sc.nextInt();
        long start = System.currentTimeMillis();



        long end = System.currentTimeMillis();
        System.out.println("수행시간: " + (end - start) / 1000 + "s");
    }
}
