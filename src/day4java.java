import java.util.Scanner;

public class day4java {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("enter the mark in math");
        int math= scan.nextInt();
        while(math>100||math<0){
            System.out.println("enter marks between 0-100");
            math=scan.nextInt();
        }

        System.out.println("enter the mark in science");
        int science= scan.nextInt();
        while(science>100||science<0){
            System.out.println("enter marks between 0-100");
            science=scan.nextInt();
        }
        System.out.println("enter the mark in nepali");
        int nepali= scan.nextInt();
        while(nepali>100||nepali<0){
            System.out.println("enter marks between 0-100");
            nepali=scan.nextInt();
        }
        System.out.println("enter the mark in english");
        int english= scan.nextInt();
        while(english>100||english<0){
            System.out.println("enter marks between 0-100");
            english=scan.nextInt();
        }
        System.out.println("enter the mark in social");
        int social= scan.nextInt();
        while(social>100||social <0){
            System.out.println("enter marks between 0-100");
        social=scan.nextInt();
        }

        float avg= (math+english+science+social+nepali)/5;
        if (avg>=95){
            System.out.println("first grade");
        }

        else if (avg >=80 && avg <95 ){
            System.out.println("second grade");
        }
        else if (avg >=60 && avg <80){
            System.out.println("third grade");
        }
        else{
            System.out.println("you are fail");
        }




    }
}
