import java.util.*;
public class oneToNrecurrsion {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
       int n = sc.nextInt();
        funrev(n);
    }

    static void funrev(int n){
        if(n==0){
            return;
        }

        funrev(n-1);
        System.out.println(n);
    }
}