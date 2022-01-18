package com.algorithm.java.string.문자열압축;

import java.util.Scanner;

public class Main {
    public String  solution(String str) {
        str += " ";
        String answer = "";
        int cnt=1;

        for(int i=0; i<str.length()-1; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                cnt++;
            }else{
                answer += str.charAt(i);
                if(cnt != 1){
                    answer += cnt;
                    cnt = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        Main main = new Main();
        System.out.println(main.solution(str));
    }
}
