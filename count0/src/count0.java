public class count0 {
    public static void main(String[] args) {
           System.out.println(count(20405,0));
    }
    static int count(int n , int c){
        if(n==0){
            return c;
        }
        int rem = n%10;
        if(rem==0){
            return count(n/10,c+1);
        }
        return count(n/10,c);
    }
}