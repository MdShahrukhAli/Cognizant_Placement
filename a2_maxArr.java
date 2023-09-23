import java.util.*;
public class a2_maxArr {
    public static void main(String[] args) {
        int max=Integer.MIN_VALUE;
        int arr[]={5,3,4,7,8,9,1,2,6};
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);

    }
}
