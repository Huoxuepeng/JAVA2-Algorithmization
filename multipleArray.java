package showFactor;


import java.util.Scanner;

public class showFactor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("enter a number: ");
        num = in.nextByte();
        System.out.println("enter array: ");
        int[] array = new int[5];
        for (int i = 0;i < array.length;i++){
            array[i] = in.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % num == 0) {
                sum += array[i];
            }
        }
        System.out.println("The sum of the elements of the array A[N], multiples of K = " + num + " sum = " + sum);
    }

}
