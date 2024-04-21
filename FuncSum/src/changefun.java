import java.util.*;
public class changefun {
    public static void main(String[]  args) {
        int[] arr={1,3,4,2,};
        change(arr);


        System.out.println(Arrays.toString(arr));
    }
   static void change(int [] num){
        num[0]=99;
    }
}
