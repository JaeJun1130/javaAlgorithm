package com.algorithm.java.string.단어뒤집기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    /**
     * reverse()메소드를 사용한다
     */
    public List<String> solution(int n, String[] str) {
        List<String> answer = new ArrayList<>();
        if (n >= 3 && n <= 20) {
            for (String s : str) {
                String tmp = new StringBuilder(s).reverse().toString();
                answer.add(tmp);
            }
        }
        return answer;
    }

    /**
     * 문자열을 직접 뒤집을때는 lt, rt 를 정해놓고 서로 순서를 바꾼
     */
    public List<String> reverse(int n, String[] str) {
        List<String> answer = new ArrayList<>();
        for (String x : str) {
            char[] s = x.toCharArray();
            int lt=0, rt=x.length()-1;
            while (lt<rt){
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String[] str = new String[number];

        for (int i = 0; i < number; i++) {
            str[i] = sc.next();
        }

        Main main = new Main();
        List<String> solution = main.reverse(number, str);
        for (String s : solution) {
            System.out.println(s);
        }
    }
}
