import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter age");
        int age = scan.nextInt();
        if (age>=70)
        {
            System.out.println("you are too old");
        }
        else if (age>=21)
        {
            System.out.println("U are allowed");
        }
        else if (age==20)
        {
            System.out.println("Come back next year");
        }

        else
        {
            System.out.println("u are too young to enter");
        }
    }
}
