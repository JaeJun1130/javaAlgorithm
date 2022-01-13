package com.algorithm.java.algorithm;

/**
 * 최소값 알고리즘
 */
public class MinAlgorithm {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        
        int[] data = {9994,12312,153,24123,2304,4341215,1239,12312306,123050};

        for (int datum : data) {
            if(datum < min){
                min = datum;
            }
        }
        System.out.println("min = " + min);
    }
}
