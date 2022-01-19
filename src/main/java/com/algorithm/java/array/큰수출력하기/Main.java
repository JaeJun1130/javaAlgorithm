package com.algorithm.java.array.큰수출력하기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public List<Integer>  solution(int[] number) {
        List<Integer> answer = new ArrayList<>();

        answer.add(number[0]);
        for(int i=1; i< number.length; i++){
            if(number[i-1] < number[i]) answer.add(number[i]);
        }
        
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number[] = new int[n];

        for(int i=0; i<n; i++){
            number[i] = sc.nextInt();
        }
        Main main = new Main();
        for(int i :main.solution(number)){
            System.out.print(i+" ");
        }
    }
}
