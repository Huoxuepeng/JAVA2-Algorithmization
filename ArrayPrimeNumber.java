package ReplaceMent;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceMent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] array = new int[6];
        int sum = array[1] + array[2];
        System.out.println("enter an array: ");
        for(int i = 3; i < array.length; i++) {
            array[i] = in.nextInt();
            for(int j = 2; j <= i; j++){
                if(i % j == 0){
                    break;
                }else{
                    sum += array[i];
                }
            }

        }
        System.out.println(sum);

    }
}
