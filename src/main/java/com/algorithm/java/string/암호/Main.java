package com.algorithm.java.string.암호;

import java.util.Scanner;

public class Main {
    public String  solution(int n, String str) {
        String answer = "";

        for(int i=0; i<n; i++){
            String tmp = str.substring(0,7).replace("#","1").replace("*","0");;
            str = str.substring(7);
            char c = (char) Integer.parseInt(tmp, 2);
            answer += c;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        Main main = new Main();
        System.out.print(main.solution(n,str));
    }
}
