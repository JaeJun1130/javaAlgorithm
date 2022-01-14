package com.algorithm.java.algorithm;

/**
 * 선택정렬
 */
public class SortAlgorithm {
    public static void main(String[] args) {
        //Input
        int[] data = {3,2,1,5,4};
        int N = data.length; //의사코드
        
        //Process
        for (int i=0; i<N-1; i++){
            for (int j=i+1; j<N; j++){
                if(data[i] > data[j]){  //부둥호 방향
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
        
        //Output
        for (int datum : data) {
            System.out.println("datum = " + datum);
        }
        
    }
}
