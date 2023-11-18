import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        if(n>0){
            System.out.println(n+" Is Possitive");
        }else if(n<0){
            System.out.println(n+" Is negative");
        }else {
            System.out.println(n+" Is Zero");
        }
    }
}