import java.util.*;
public class overloading {
    public static void main(String[] args){
        fun(67,78,90,3);
        demo("sdsfdx","fdfvd");
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }


}