import java.util.*;
public class Main {
    public static void main(String[] args){
        System.out.println("enter two 2 number");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int ch;
        System.out.println("enter your choice");
        ch =sc.nextInt();
        do {
            switch (ch) {
                case 1:
                    System.out.println(a + b);
                    break;
                case 2:
                    System.out.println(a - b);
                    break;

                case 3:
                    System.out.println(a * b);
                    break;
                case 4:
                    System.out.println(a / b);
                    break;
                default:
                    System.out.println("invalid choice");
            }
        }while(ch!=4);





    }
}