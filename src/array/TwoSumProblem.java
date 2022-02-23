package array;

import kotlin.reflect.jvm.internal.pcollections.HashPMap;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumProblem {

    public static void main(String[] args) {
        int[] array = {1 , 6 , 4 ,8 ,3};
        int [] result = twoSum2(array , 4);
        System.out.println(Arrays.toString(result));
        double x = 2819653.00;
        System.out.println(Double.MAX_VALUE);

    }

    public static int [] twoSum (int [] array , int target){

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i] + array[j] == target){
                    return new int[]{i , j};
                }
            }
        }
        throw new IllegalArgumentException("No available two sum array for target");
    }

    public static int [] twoSum2 (int [] array , int target){

        HashMap map = new HashMap<Integer,Integer>();
        for (int i = 0; i < array.length; i++) {
            int comp = target - array[i];
            if(!map.containsKey(comp)){
                map.put(array[i] , i);
            }else {
                return new int[] { i , (int) map.get(comp)};
            }
        }
        throw new IllegalArgumentException("No available two sum array for target");
    }
}
