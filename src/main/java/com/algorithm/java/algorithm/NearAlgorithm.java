package com.algorithm.java.algorithm;

/**
 * 근사값 알고리즘 : 차잇값의 절댓값의 최솟값
 */
public class NearAlgorithm {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;// 최솟값이 담길 그릇

        int[] numbers = {10,20,30,27,17};
        int target = 25;    //타겟과 가장 가까운 수 구하기
        int near = 0;       //가까운 값

        for (int number : numbers) {
            int abs = Abs(number - target); //차잇값의 절대값
            System.out.println("abs = " + abs);
            if(abs < min){ //최소값
                min = abs;
                near = number;
            }
        }

        System.out.println("near = " + near);
        System.out.println("min = " + min);
    }

    //절댓값
    public static int Abs(int number){
        return (number < 0) ? -number : number;
    }
}
