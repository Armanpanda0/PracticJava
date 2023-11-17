import java.util.Scanner;

public class SumOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Two numbers: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int ans=0;
        if(num1 / 100 ==0 && num2 / 100==0){
            ans=num1+num2;
            System.out.println("Addition is "+ans);
        }
        else {
            System.out.println("Both numbers are not two digit");
        }
    }
}
