import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1;
        System.out.print(a+" "+b+" ");
        for (int i=0;i<n;i++){
            int c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }

    }
}
