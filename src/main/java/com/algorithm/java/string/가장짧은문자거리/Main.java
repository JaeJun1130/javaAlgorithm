package com.algorithm.java.string.가장짧은문자거리;

import java.util.Scanner;

public class Main {
    public int[]  solution(String str, char c) {
        int N = str.length();
        int[] answer = new int[N];
        int P = 1000;

        for(int i=0; i<N; i++){
            if(str.charAt(i) == c) {
                P = 0;
                answer[i] = P;
            }else {
                P++;
                answer[i] = P;
            }
        }
        P=1000;
        for(int i=N-1; i>=0; i--){
            if(str.charAt(i) == c) {
                P = 0;
                answer[i] = P;
            }else {
                P++;
                answer[i] = Math.min(answer[i],P);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);

        Main main = new Main();

        for (int x : main.solution(str,c)) {
            System.out.print(x+" ");
        }
    }
}
