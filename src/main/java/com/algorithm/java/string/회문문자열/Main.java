package com.algorithm.java.string.회문문자열;

import java.util.Scanner;

public class Main {
    /**
     * 문자열 길이/2 후 제일앞 문자열 제일 뒤문자열이 같는지 비교하면서 i증가
     */
    public String  solution(String str) {
        String result ="YES";
        str = str.toUpperCase();
        int length = str.length();

        for(int i=0; i<length/2; i++){
            if(str.charAt(i) != str.charAt(length-i-1)){
                return "NO";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        Main main = new Main();
        System.out.println(main.solution(str));
    }
}
