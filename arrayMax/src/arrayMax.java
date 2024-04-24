
import java.util.*;
public class arrayMax {
    static int max(int[] arr){
        int min = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
                int ans = arr[i];
            }
        }
        return arr[i];

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of arrray");
        int size=sc.nextInt();
        int [] arr=new int[size];
        System.out.println("enter elements in array");
        for(int i = 0 ; i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        int ans = max(arr);
        System.out.println(ans);



        }


}
