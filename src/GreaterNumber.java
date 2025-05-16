import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        int greater;
        Scanner a = new Scanner(System.in);
        System.out.println("enter your first number :\n");
        int x = a.nextInt();
        System.out.println("enter your 2nd  number :\n");
        int y= a.nextInt();

      greater = x | y;
        System.out.println("Greater is :" + greater);

    }
}


