package com.noahL;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int result;
        result=(m*n)/2;
        System.out.println(result);
    }

/*    Note for my self
Total area = number of dominoes * area of each domino
i am given total area(m*n),area of each domino(2) so....
max number of dominoes = total area/area of each domino
  */
}
