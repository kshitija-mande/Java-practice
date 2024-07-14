import java.util.Arrays;
public class quickSort {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] nums,int low,int hi){
        if(low>=hi){
            return;

        }
        int s = low;
        int e = hi;
        int m =s+(s-e)/2;
        int pivot = nums[m];

        while (s <= e) {
        while(nums[s]<pivot){
            s++;

        }
        while(nums[e]>pivot){
            e--;
        }
        if(s<=e){
            int temp = nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
        }

        }
        sort(nums,low,e);
        sort(nums,s,hi);
    }
}