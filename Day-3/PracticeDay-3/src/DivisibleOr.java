import java.util.Scanner;

public class DivisibleOr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n=sc.nextInt();
        if(n%5==0 && n%11==0){
            System.out.println("The number is divisible both 5 and 11. ");
        }else {
            System.out.println("Not divisible by both. ");
        }
    }
}
