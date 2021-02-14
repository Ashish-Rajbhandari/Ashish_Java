import java.util.Scanner;

public class Work2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the marks of math");
        int math = scanner.nextInt();

        System.out.println("Enter the marks of science");
        int science = scanner.nextInt();

        System.out.println("Enter the marks of english");
        int english = scanner.nextInt();

        System.out.println("Enter the marks of nepali");
        int nepali = scanner.nextInt();

        System.out.println("Enter the marks of account");
        int account = scanner.nextInt();

        float sum = math + science + english + nepali + account;
        System.out.println("Sum:" + sum);
        float avg = sum / 5;
        System.out.println("Average:" + avg);

        if (avg <= 0 || avg > 100) {
            System.out.println("this is not acceptable");
        } else if (avg >= 95 && avg < 100) {
            System.out.println("U deserve grade A");
        } else if (avg >= 80 && avg < 95) {

            System.out.println("U deserve grade B");
        } else if (avg >= 60 && avg < 80) {
            System.out.println("U deserve grade C");
        } else {
            System.out.println(" You are failed");
        }


    }
}
