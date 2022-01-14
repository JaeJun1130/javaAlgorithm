package com.algorithm.java.algorithm;

/**
 * 병합 알고리즘
 */
public class MergeAlgorithm {
    public static void main(String[] args) {
        //오름차순 전제조건
        int[] first = {1,3,5};
        int[] second = {2,4};
        int M =first.length;
        int N =second.length;
        
        int[] merge = new int[M+N];
        int i=0; int j=0; int k=0;
        
        //둘중하나라도 배열에 끝에 도달
        while(i<M && j<N) {
            if(first[i] < second[j]){
                merge[k++] = first[i++];
            }else{
                merge[k++] = second[j++];
            }
            while(i<M){
                merge[k++] = first[i++];
            }
            while(j<N){
                merge[k++] = second[j++];
            }
        }
        for (int i1 : merge) {
            System.out.println("i1 = " + i1);
        }
    }
}
