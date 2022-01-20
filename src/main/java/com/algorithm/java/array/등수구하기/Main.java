package com.algorithm.java.array.등수구하기;

import java.util.Scanner;

public class Main {
    public int[] solution(int n, int[] arr) {
        int[] answer = new int[n];
        for(int i=0; i<n; i++){
            int count = 1;
            for(int j=0; j<n; j++){
                if(arr[j] > arr[i]) count++;
            }
            answer[i] = count;
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

        for(int a:main.solution(n,arr)){
            System.out.print(a + " ");
        }
    }
}
