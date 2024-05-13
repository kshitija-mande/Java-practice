import java.util.*;
public class occurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = sc.nextInt();
        int ram[]= new int[size];

        for(int i = 0;i<size;i++){
            ram[i]=sc.nextInt();

        }
        int count=0;
        System.out.println("enter the number ");
                int n=sc.nextInt();
        for(int i=0;i<size;i++) {
            if (ram[i] == n) {
                count++;
            }
            System.out.println(count);
        }

    }
}