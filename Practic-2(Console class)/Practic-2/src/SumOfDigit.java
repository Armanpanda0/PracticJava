import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        while(n!=0){
            int rem=n%10;
            ans=ans+rem;
            n/=10;
        }
        System.out.println("The sum of digit is: ");
        System.out.println(ans);
    }
}
