package com.algorithm.java.algorithm;

import java.util.Scanner;

/**
 * n명의 국어 점수 중에서 80점 이상인 점수의 합계
 * 합계 알고리즘 (SumAlgorithm) : 주어진 범위에 주어진 조건에 해당하는 자료들의 합계
 */
public class SumAlgorithm {
//    public static void main1(String[] args) {
//        //1 Input : n명의 국어 점수
//        int[] scores = {100,75,50,37,90,95};
//        int sum = 0;
//
//        //2 Process : 합계 알고리즘 영역
//        for (int i = 0; i < scores.length; i++) {
//            if(scores[i] >= 80){
//                sum += scores[i]; //SUM 알고리즘 영역
//            }
//        }
//
//        //3 Output
//        System.out.println("80점 이상의 점수 총점 = " + sum);
//    }

    public static void main(String[] args) {
        //Input
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[5];
        int maxInput = 5;
        int sum = 0;

        for(int i=0; i<maxInput; i++){
            System.out.println("5명 학생의 점수를 입력하세요 : " +"[" + (i+1) +"]"+ "번");
            scores[i] = scanner.nextInt();
        }

        //Process
        for(int score : scores){
            if(score>=80){
                sum += score;
            }
        }

        //Output
        System.out.println("80점 이상의 점수 총점 = " + sum);
    }
}
