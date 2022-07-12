package getMaxofArray;

import java.util.Scanner;

public class getMaxofArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m;
        System.out.println("enter number n: ");
        m = in.nextInt();
        double [] array = new double[m];
        if(array.length % 2 != 0){
            throw new IllegalArgumentException("the array of length is positive number");
        }
        System.out.println("Populate the array: ");
        for(int i = 0; i < array.length; i++){
            array[i] = in.nextInt();
        }
        System.out.println("Maxsum = " + maxSumEvenArray(array));
    }
    public static double maxSumEvenArray(double[] array){
        double maxSum = array[0] + array[array.length - 1];
        for(int i = 1; i < array.length / 2; i++){
            if((array[i] + array[array.length - i - 1]) > maxSum){
                maxSum = array[i] + array[array.length - i - 1];
            }
        }
        return maxSum;
    }
}
