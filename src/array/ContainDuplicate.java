package array;

import java.util.Arrays;
import java.util.HashSet;

public class ContainDuplicate {

    public static void main(String[] args) {
int []a = {2,4,6,9,7,7};
        System.out.println(containDublicates2(a));
    }

    static  boolean containDublicates (int [] a){
        Arrays.sort(a);
        for (int i = 0; i < a.length-1; i++)
                if(a[i] == a[i+1])  return true ;

        return false ;
    }
    static  boolean containDublicates2 (int [] a){

        HashSet set = new HashSet<Integer>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        return !(set.size() == a.length);
    }

}
