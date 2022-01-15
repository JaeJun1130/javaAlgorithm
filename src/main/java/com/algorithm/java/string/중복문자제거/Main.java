package com.algorithm.java.string.중복문자제거;

import java.util.Scanner;

public class Main {
    /**
     * indexOf는 이미 읽은 문자번지는 0으로 찍힘
     */
    public String  solution(String str) {
        String result = "";
        for(int i=0; i<str.length(); i++){
            if(str.indexOf(str.charAt(i)) == i) result+= str.charAt(i);
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
