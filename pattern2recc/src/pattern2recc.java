public class pattern2recc {
    public static void main(String[] args) {
        triangle(4,0);
    }
    static void triangle(int r,int c){
        if(r==0){
            return;
        }
        if(r>c){

            triangle(r,c+1);
            System.out.print("*");
        }
        else{

            triangle(r-1,0);
            System.out.println();

        }
    }
}