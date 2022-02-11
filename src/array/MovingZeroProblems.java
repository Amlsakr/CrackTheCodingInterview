package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovingZeroProblems {

    public static void  main(String [] args){
      int [] a = {0,4,0,8,9};
        System.out.println(Arrays.toString(moveZeroProblem3(a)));
    }

    public static int[] moveZeroProblem(int[]a ){
        int counterZero = a.length - 1 ;
        int counterNumber = 0 ;
        int [] result = new int [a.length];
        for (int i = 0; i < a.length; i++) {
            if(a[i] > 0 | a[i] < 0){
                result[counterNumber] = a[i];
                counterNumber ++;
            }else {
                result[counterZero] = a[i];
                counterZero --;
            }
        }
        return result ;
    }

    public static int[] moveZeroProblem2(int [] a){
        List list = new ArrayList();
        int zCount = 0 ;
        for (int i = 0; i < a.length; i++) {
            if (a[i]==0){
                zCount++;
            }else {
                list.add(a[i]);
            }
        }

        for (int i = 0; i < zCount; i++) {
            list.add(0);
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)list.get(i);
        }
        return  a ;
    }

    public static int[] moveZeroProblem3(int [] a) {
        int slow = 0 ;
        for (int fast = 0 ; fast<a.length ; fast++ ){
            if(a[fast] != 0){
                swap(a , fast ,slow);
                slow++;
            }
    }
        return  a;
    }

    private static void swap(int[] a, int fast, int slow) {
        int temp = a[fast];
        a[fast] = a[slow];
        a[slow] = temp;
    }
}
