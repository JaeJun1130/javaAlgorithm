package com.algorithm.java.algorithm;

/**
 * 최빈값 : 주어진 데이터에서 가장 많이 나타난 값
 */
public class ModeAlgorithm {
    public static void main(String[] args) {
        int[] scores = {1,3,4,3,2,1,2,5,5,2,1,4,2,1,1}; //0~5
        int mode = 0; //최빈ㄱ밧 담길 그릇

        int[] index = new int[scores.length+1];
        int max = Integer.MIN_VALUE;

        for(int i=0; i<scores.length; i++){
            index[scores[i]]++; //점수를 인덱스로 본다.
        }

        for(int i=0; i<index.length; i++){
            if(index[i]> max){
                max = index[i];
                mode = i;
            }
        }
        System.out.println("mode = " + mode);
    }
}
