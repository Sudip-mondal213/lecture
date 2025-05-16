import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        Scanner  a = new Scanner(System.in);

        greet ();

        int b = readnumber();
        int c = readnumber();

        int sum = c+b;
        System.out.println(sum);
    }

    public static int readnumber(){
        Scanner  a = new Scanner(System.in);
        System.out.println("please enter your number");
        return a.nextInt();
    }

    public static void greet (){
        System.out.println("welcome to calculator");
    }

}
