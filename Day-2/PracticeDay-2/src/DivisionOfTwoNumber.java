import java.util.Scanner;

import java.util.Scanner;
public class DivisionOfTwoNumber {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Two numbers: ");
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            int ans=0;
            if(num1 / 100 ==0 && num2 / 100==0) {
                if (num2 == 0) {
                    System.out.println("Invalid input ");
                } else {
                    ans = num1 / num2;
                    System.out.println("Addition is " + ans);
                }
            }
            else {
                System.out.println("Both numbers are not two digit");
            }
        }


}
