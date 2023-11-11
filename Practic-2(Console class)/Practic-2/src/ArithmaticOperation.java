import java.util.Scanner;

public class ArithmaticOperation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("1.Addition: +");
        System.out.println("2.Subtraction: -");
        System.out.println("3.Multiplication: *");
        System.out.println("4.Modulo: %");
        System.out.println("5.Division: /");
        System.out.println("Enter the 1St num: ");
        int num1=sc.nextInt();
        System.out.println("Enter the 2nd Number: ");
        int num2=sc.nextInt();

        int ans=0;
        System.out.println("Enter the opration: ");
        int choice=sc.nextInt();
        switch (choice){
            case 1:
                ans=num1+num2;
                System.out.println("Addition is "+ans);
                break;
            case 2:
                ans=num1-num2;
                System.out.println("Subtraction is "+ans);
                break;
            case 3:
                ans=num1*num2;
                System.out.println("Multiplication is "+ans);
                break;
            case 4:
                ans=num1%num2;
                System.out.println("Modulodivision is "+ans);
                break;
            case 5:
                ans=num1/num2;
                System.out.println("Division is "+ans);
                break;
            default:
                System.out.println("Invalid input .");
        }
    }
}
