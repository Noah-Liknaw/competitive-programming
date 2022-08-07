package com.noahL;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int[] array = new int[n];
        int swaps=0;
        int temp;
//        Input array
        for (int i=0;i<n;i++){
            array[i]=input.nextInt();
        }
//        Bubble sort
        for(int i=0;i<n;i++){
            for (int j=0;j<(n-1);j++){
                if(array[j] > array[j+1]){
                    temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                    swaps++;
                }
            }
        }
//        Display result
        System.out.println("Array is sorted in "+swaps+" swaps.");
        System.out.println("First Element: "+array[0]);
        System.out.println("Last Element: "+array[n-1]);
    }
}
