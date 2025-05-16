import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your loop count =");
        int n = in.nextInt();
        firstpattern(n);
    }
    public static void firstpattern( int a){

        int row =0;
        while(row <  a) {

            int i =0;
            while(i <=row){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            row ++;

        }
    }

//    public static void secondndpattern() {
//
//    }
//    public static void thriedpattern(){
//
//    }

}
