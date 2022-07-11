package ReplaceMent;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ReplaceMent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("enter number: ");
        n = in.nextInt();
        int [] array = new int[5];
        System.out.println("enter an array: ");
        for(int i = 0; i < array.length; i++){
            array[i] = in.nextInt();
            if(array[i] > n){
                System.out.println(array[i]);
            }
        }

    }
}
