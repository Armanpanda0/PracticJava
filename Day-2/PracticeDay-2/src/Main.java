import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Hello world!");
        int num1=sc.nextInt();
        System.out.println("2nd Num: ");
        int num2=sc.nextInt();
        System.out.println("Operation symbol is: ");
        char choice=sc.next().charAt(0);
        switch (choice){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            case '%':
                System.out.println(num1%num2);
                break;
            default:
                System.out.println("Wrong Answer: ");

        }
    }
}