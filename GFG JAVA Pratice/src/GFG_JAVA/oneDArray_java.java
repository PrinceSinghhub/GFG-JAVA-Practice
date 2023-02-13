package GFG_JAVA;

import java.util.Scanner;

public class oneDArray_java {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int[] arr = new int[range];
        for (int i = 0; i < arr.length; i++) {
            int input = sc.nextInt();
            arr[i] = input;

        }
        for(int n: arr){
            System.out.println(n);
        }
    }
}
