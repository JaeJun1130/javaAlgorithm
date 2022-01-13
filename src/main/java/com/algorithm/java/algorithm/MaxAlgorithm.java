package com.algorithm.java.algorithm;

/**
 * 최댓값 알고리즘
 */
public class MaxAlgorithm {
    public static void main(String[] args) {
        //Init
        int max = Integer.MIN_VALUE; //정수 형식의 데이터 중 가장 작은 값으로 초기화

        //Input
        int[] numbers = {-2,-5,-3,-8,-1};

        //Process
        for (int number : numbers) {
            if(number > max){
                max = number; //더큰값으로 할당
            }
        }

        //Output
        System.out.println("max = " + max);
    }
}
