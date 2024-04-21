import java.util.*;

public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){

            double pi =3.14;
            System.out.println("enter the radius of circle");
            float r = sc.nextFloat();
            System.out.println(pi*r*r);
            if(r==0){
                break;
            }
        }
    }
}
