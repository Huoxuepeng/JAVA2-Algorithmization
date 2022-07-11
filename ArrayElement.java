package ReplaceMent;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ReplaceMent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] array = {1,2,3,4,-5,-7,0,-8};
        int x=0,y=0,z=0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > 0){
                x++;
            }else if(array[i] < 0){
                y++;
            }else{
                z++;
            }
        }
        System.out.println("the number of positive number: " +x +",the number of negative number: " +y
                +",the number of 0: " +z);


    }
}
