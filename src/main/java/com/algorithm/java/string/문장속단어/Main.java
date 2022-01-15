package com.algorithm.java.string.문장속단어;

import java.util.Scanner;

public class Main {
    /**
     * Max 알고리즘, split 이용
     */
    public String  solution(String str) {
        String answer = "";
        int Max = Integer.MIN_VALUE;
        String[] s = str.split(" ");

        for(String x : s){
            int length = x.length();
            if(length > Max){
                Max = length;
                answer = x;
            }
        }
        
        return answer;
    }

    /**
     * indexOf, SubString()
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String answer = "";
        int Max = Integer.MIN_VALUE, pos;

        while ((pos=str.indexOf(' '))!= -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > Max) {
                Max = len;
                answer = tmp;
            }
            str = str.substring(pos + 1);
        }

        //마지막에 공백이 없는 문자열이기떄문에 저장된 str 이랑 한번더 비교
        if(str.length() > Max) answer = str;
            System.out.println("tmp = " + answer);
    }
//        Main main = new Main();
//        System.out.println(main.solution(str));
}
