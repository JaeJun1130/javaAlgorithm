package com.algorithm.java.string.숫자만출력;

import java.util.Scanner;

public class Main {
    public int  solution(String str) {
        str = str.replaceAll("[^0-9]","");
        return Integer.parseInt(str);
//        Character.isDigit()
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        Main main = new Main();
        System.out.println(main.solution(str));
    }
}
