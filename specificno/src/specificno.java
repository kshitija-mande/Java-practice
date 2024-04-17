import java.util.*;
public class specificno {
    public static void main(String[] args) {
        int count = 0;
    Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();


        while (n>0) {
            int rem = n % 10;

            n /= 10;
            count++;

               }

        System.out.println(count);

        }


    }
