package com.algorithm.java.algorithm;

/**
 * 갯수 알고리즘 : 주어진 범위에 주어진 조건에 해당하는 자료들의 개수
 */
public class CountAlgorithm {
    //13의 배수
    public static void main(String[] args) {
        //Input
        int[] numbers = {11,12,13,13,15,13};
        int count = 0;

        //Process
        for(int num :numbers){
            if(num % 13 == 0){
                count++;
            }
        }
        //Output
        System.out.println("count = " + count);
    }
}
