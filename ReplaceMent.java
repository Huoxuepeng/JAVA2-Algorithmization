package ReplaceMent;

import java.util.Scanner;

public class ReplaceMent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Z;
        System.out.println("enter number: ");
        Z = in.nextByte();
        int [] array = {1,2,3,4,5};
        ReplaceMent(array,Z);
    }
    private static void ReplaceMent(int[] array, int Z) {
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            if (array[i] > Z) {
                array[i] = Z;
                count++;
            }
        }
        System.out.println("count is: " +count);
    }
}
