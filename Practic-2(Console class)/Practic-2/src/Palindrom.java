import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {

                Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
                int n=sc.nextInt();
                int num=n;
                int ans=0;
                while(n!=0){
                    int rem=n%10;
                    ans=ans*10+rem;
                    n/=10;
                }
                if (num==ans){
                    System.out.println("Number is Palindrom");
                }else
                    System.out.println("Number is not Palindrom");


    }
}
