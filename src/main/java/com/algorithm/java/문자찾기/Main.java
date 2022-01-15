package com.algorithm.java.문자찾기;

import java.util.Scanner;

/**
 * 문자찾기
 */
public class Main {
    public int solution(String str, char t) {
        int answer = 0;
        str = str.toLowerCase();
        t = Character.toLowerCase(t);

        for (char x : str.toCharArray()) {
            if(x==t) answer++;
        }
        return answer;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char t = sc.next().charAt(0);

        Main main = new Main();
        System.out.println(main.solution(str, t));
    }
}
