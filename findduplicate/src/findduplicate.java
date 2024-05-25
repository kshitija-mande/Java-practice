import java.util.Arrays;
public class findduplicate {
public static void main(String[] args){
    int[] arr={3,1,4,2,2};
    duplicate(arr);
    System.out.println(Arrays.toString(arr));
    }
    public static int duplicate(int[] arr){
         int i=0;
         while(i<arr.length){
             if(arr[i]!= i+1){
                 int correct= arr[i]-1;
                 if(arr[i] !=arr[correct]){
                     swap(arr,i,correct);
                 }
                 else{
                      i++;
                 }
             }else{
                 return arr[i];
             }
         }
         return -1;
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }


}
