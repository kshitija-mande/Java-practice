import java.util.*;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("enter the 1st number");
        int a=sc.nextInt();
       System.out.println("Enter the 2nd number");
        int b=sc.nextInt();
       System.out.println("Enter the 3rd number");
        int c=sc.nextInt();
        if(a>b&a>c){
            System.out.println("A is the largest");

        }
        else if(a<b&c<b){
            System.out.println("B is the largest");
        }
        else{
            System.out.println("C is the largest");
        }


    }
}