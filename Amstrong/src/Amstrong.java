import java.util.*;
public class Amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       System.out.println(isAmstrong(n)) ;

    }

    static boolean isAmstrong(int n) {
        int orignal = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem * rem * rem;
        }
        if (sum == orignal) {
            return true;
        }
        return false;
    }
}