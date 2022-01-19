package com.algorithm.java.array.보이는학생;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public int solution(int[] number) {
        int count =1;
        int max= number[0];

        for(int i=1; i< number.length; i++){
            if(number[i] > max){
                count++;
                max = number[i];
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number[] = new int[n];

        for(int i=0; i<n; i++){
            number[i] = sc.nextInt();
        }
        Main main = new Main();
        System.out.println(main.solution(number));;
    }
}

