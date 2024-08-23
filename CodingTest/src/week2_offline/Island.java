package week2_offline; // https://school.programmers.co.kr/learn/courses/30/lessons/42885

import java.util.Scanner;

public class Island {
    public static void main(String[] args) {
        int[] people = {70, 50, 80};
        int limit = 100;

        int answer = 0;

        for (int i = 0; i < people.length - 1; i++) {
            if ((people[i] > (limit / 2)) && (limit - people[i] < 40)) {
                people[i] = 0;
            } else if (people[i] + people[i + 1] <= limit) { // 합이 limit보다 작을 때 같이 탈출
                people[i] = 0;
                people[i + 1] = 0;
            } else if (people[i] + people[i + 1] == 0) { // 둘이 합쳐서 0, 이미 탈출 완료
                answer--;
            }
            answer++;
        }

        System.out.println(answer);
    }
}
