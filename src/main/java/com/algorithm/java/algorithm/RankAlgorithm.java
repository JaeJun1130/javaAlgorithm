package com.algorithm.java.algorithm;

/**
 * 순위 알고리즘
 * 주어진 데이터의 순위
 */
public class RankAlgorithm {
    public static void main(String[] args) {
        //Input
        int[] scores = {90, 87, 100, 95, 45, 64, 99};
        int[] rankings = {1,1,1,1,1,1,1,1};

        //Process
        for(int i=0; i<scores.length; i++){
            rankings[i] = 1; //1순위로 항상 초기화
            for(int j=0; j<scores.length; j++){ //현재와 나머지 비고
                if(scores[i] < scores[j]) {
                    rankings[i]++; //나보다 큰 점수가 나오면 순위 비교
                }
            }
        }

        //Output
        for(int i=0; i<scores.length; i++){
            System.out.println(scores[i]+ "점"+rankings[i]+"등");
        }
    }
}
