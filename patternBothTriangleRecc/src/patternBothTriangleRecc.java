public class patternBothTriangleRecc {
    public static void main(String[] args) {
        triangle(4,0);
    }
    static void triangle(int r,int c){
        if(r==0){
            return;
        }
        if(r>c){
            System.out.print("*");
            triangle(r,c+1);
            System.out.print("*");
        }
        else{
            System.out.println();
            triangle(r-1,0);
            System.out.println();

        }
    }
}