package binarySearch;

public class FindNumberInArray {

    public static void main(String[] args) {

        int [] a = {-1,0,3,5,7,8,9};
        System.out.println(findTarget(a ,70));
    }

    public static  boolean findTarget (int [] a , int target){
        for (int i = 0; i < a.length; i++) {
            int s = 0 ;
            int e = a.length - 1;
            while (s<= e){
                int mid = (s + e)/2;
                if (a[mid] == target){
                    return true ;
                }else if (a[mid] <target){
                    s = a[mid+1];
                }else {
                    e = a[mid -1];
                }
            }
        }
        return  false ;
    }
}
