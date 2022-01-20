package com.algorithm.java.array.소수;



/**
 * 에라토스테네스
 * 0,1는 소수가 아님
 */
import java.util.Scanner;
public class Main {
    public int solution(int n) {
        int count =0;
        int[] ch = new int[n+1];
        for(int i=2; i<=n; i++){
            if(ch[i] == 0){
                count++;
                for(int j=i; j<=n; j=j+i) ch[j]=1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Main main = new Main();
        System.out.println(main.solution(n));;
    }
}
