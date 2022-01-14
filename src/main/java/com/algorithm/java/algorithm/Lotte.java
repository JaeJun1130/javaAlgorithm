package com.algorithm.java.algorithm;

import java.util.Random;

public class Lotte {
    public int[] solution(int[] lottos, int[] win_nums){
        int maxCount = 0;
        int min = 0;
        int max = 0;
        //Process
        for(int i=0; i<lottos.length; i++){
            if(lottos[i] == 0 && max < 5)  max++;

            for(int j=0; j<win_nums.length; j++){
                if(lottos[i] == win_nums[j]){
                    min++;
                }
            }
        }
        for(int i=0; i<lottos.length; i++){
            if(lottos[i] == 0 && (min+max) == 0) min++;
        }
        maxCount = min+max;

        int[] answer = new int[2];
        if(maxCount == 6) answer[0] = 1;
        else if(maxCount == 5) answer[0] = 2;
        else if(maxCount == 4) answer[0] = 3;
        else if(maxCount == 3) answer[0] = 4;
        else if(maxCount == 2) answer[0] = 5;
        else answer[0] = 6;

        if(min == 6) answer[1] = 1;
        else if(min == 5) answer[1] = 2;
        else if(min == 4) answer[1] = 3;
        else if(min == 3) answer[1] = 4;
        else if(min == 2) answer[1] = 5;
        else answer[0] = 6;

        return answer;
    }

    public static void main(String[] args) {
//        int[] lottos = {0,0,0,0,0,0};
//        int[] win_nums = {38,19,20,40,15,25};

        int[] lottos = {44,1,0,0,31,25};
        int[] win_nums = {31,10,45,1,6,19};

        Lotte lotte = new Lotte();
        int[] solution = lotte.solution(lottos, win_nums);
        System.out.println("solution = " + solution);
    }
}
