package com.algorithm.java.string.특정문자뒤집기;

import java.util.Scanner;
public class Main {
    /**
     * lt, rt Character.isAlphabetic 사용법 숙지하기
     */
    public String  solution(String str) {
        char[] chars = str.toCharArray();
        int lt=0, rt=str.length()-1;

        while(lt<rt){
            if(!Character.isAlphabetic(chars[lt])) {
                lt++;
            }else if(!Character.isAlphabetic(chars[rt])) {
                rt--;
            }else{
                char temp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = temp;
                lt++;
                rt--;
            }
        }
        String s = String.valueOf(chars);
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        Main main = new Main();
        System.out.println(main.solution(str));
    }
}
