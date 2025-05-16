import java.util.Scanner;

public class ShortHand {
    public static void main(String[] args) {
        int a=5;
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        a+=x1; //a = a+x1;this is called short hand operator.
        System.out.println(a);
        int x2= in.nextInt();
        a += x2;
        System.out.println(a);
        int x3 = in.nextInt();
        a +=x3;
        System.out.println(a);
        int x4 = in.nextInt();
        a +=x4;
        System.out.println(a);




    }
}
