package week1; // https://www.acmicpc.net/problem/2164

import java.util.ArrayList;
import java.util.Scanner;

public class Card {
    public static void main(String[] args) {
        int n = 0;

        // 숫자 입력받기, 입력값 적으므로 scanner 사용
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("숫자 입력(1~500,000)>");
            n = sc.nextInt();
        } while (n < 1 | n > 500000);

        long start = System.currentTimeMillis();

        // 입력받은 숫자만큼 배열 만들기 1~n까지
        ArrayList<Integer> list = new ArrayList<>(n); // 배열 list로 변경하기
        for (int i = 0; i < n; i++) {
            list.add(i + 1);
        }

        // 조건 성립하는 반복문
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < 1; j++) {
                list.remove(list.get(j)); // 첫번재 제거하고
                list.addLast(list.get(j)); // 2번째 뒤로 뺀 다음
                list.remove(list.get(j)); // 바로 삭제
            }
        }
        long end = System.currentTimeMillis();

        System.out.println("------------------------------------------");
        System.out.println((n - 1) + "번째 실행 후 남은 마지막 숫자: " + list);
        System.out.println("------------------------------------------");

        System.out.println("수행시간: " + (end - start) / 1000 + "s");
    }
}
