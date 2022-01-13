package com.algorithm.java.algorithm;

/**
 * 평균 알고리즘
 */
public class AverageAlgorithm {
    //n명의 점수 중에서 80점 이상 95점 이하 점수 평균
    public static void main(String[] args) {
        //Input
        int[] data = {90,50,30,85,66,88};
        int sum = 0;
        int count = 0;

        //Process
        for (int datum : data) {
            if(datum >= 80 && datum <= 95){
                sum += datum;
                count++;
            }
        }
        double avg = sum / (double)count;

        //Output
        System.out.println("avg = " + avg);
    }
}
