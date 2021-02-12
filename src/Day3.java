import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the mark of math: ");

        int math = scan.nextInt();
        while (math<0 || math>100) {
            System.out.println("not valid number");
            System.out.println("Enter the mark of math: ");
            math = scan.nextInt();
        }
        System.out.println("enter the mark of science: ");

        int science = scan.nextInt();
        while (science<0 || science>100) {
            System.out.println("not valid number");
            System.out.println("Enter the mark of science: ");
            science = scan.nextInt();
        }
        System.out.println("enter the mark of english: ");
        int english = scan.nextInt();
        while (english<0 || english>100) {
            System.out.println("not valid number");
            System.out.println("Enter the mark of english: ");
            english = scan.nextInt();
        }
        System.out.println("enter the mark of nepali: ");
        int nepali = scan.nextInt();
        while (nepali<0 || nepali>100) {
            System.out.println("not valid number");
            System.out.println("Enter the mark of nepali: ");
            nepali = scan.nextInt();
        }
        System.out.println("enter the mark of social: ");
        int social = scan.nextInt();
        while (social<0 || social>100) {
            System.out.println("not valid number");
            System.out.println("Enter the mark of social: ");
            social = scan.nextInt();
        }
        float average = (float) (math+science+english+social+nepali)/5;
        System.out.println(average);

        if (average >= 95 && average <=100){
            System.out.println("Congratulation you got \"A\"");
        }
        else if (average >= 80 && average <95){
            System.out.println("you got \"B\"");
        }
        else if (average >= 60 && average <80){
            System.out.println("you got \"C\"");
        }
        else{
            System.out.println("Sorry you failed the exam");
        }
    }
}
