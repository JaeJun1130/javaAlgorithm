package com.algorithm.java.algorithm;

/**
 * 이진검색
 */
public class SearchAlgorithm {
    public static void main(String[] args) {
        //Input
        int[] data = {3,6,2,4,7,8,1,9};
        int N = data.length;
        int search = 3;
        boolean flag =false;
        int index = -1;
        //Process
        //오름차순부
        for (int i=0; i<N-1; i++){
            for(int j=i+1; j<N; j++){
                if(data[i] > data[j]){
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
        //이진검색
        int low  = 0;
        int high = N-1;
        while (low <= high){
            int mid = (low+high) / 2;
            if(data[mid] == search){
                flag = true;
                index = mid;
                break;
            }
            if(data[mid] < search){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }


        //Output
        if(flag){
            System.out.println("index = " + index);
        }
    }
}
