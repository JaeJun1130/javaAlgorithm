package com.algorithm.java.algorithm;

/**
 * 등차수열(Arithmetic Sequence) : 연속 하는 두 수의 차이가 일정한 수열
 */

//1부터 20까지의 정수 중 홀수의 합을 구하는 프로그램
//1,3,5,7,9 -> 등차수열
public class ArithmeticSequence {
    public static void main(String[] args) {
        //Input
        int sum = 0;

        //Process
        for (int i = 0; i <= 20; i++){
            if(i % 2 != 0){
                sum += i;
                System.out.println("i = " + i); //=> 등차수열
            }
        }
        
        //Output
        System.out.println("sum = " + sum);
    }
}
