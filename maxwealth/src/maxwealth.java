
public class maxwealth {

    public static void main(String[] args)
    {
        int [][]arr={
                {1,2,3,4},
                {2,4,6,8},
                {2,4,5,6}

                     };


        System.out.println((max(arr)));
    }
    static int max(int[][] arr){
        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];

            }
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
}

