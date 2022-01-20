package com.algorithm.java.array.점수계산;

import java.util.Scanner;

public class Main {
    public int solution(int n, int[] arr) {
        int answer = 0;
        int count = 0;

        for(int i=0; i<n; i++){
            if(arr[i] == 1){
                count++;
                answer += count;
            }else count = 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Main main = new Main();

        System.out.println(main.solution(n,arr));
    }
}
