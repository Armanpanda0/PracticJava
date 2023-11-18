import java.util.Scanner;

public class SideTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 3 Side of the triangle");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if((a+b)>c && (b+c)>a && (a+c)>b){
            System.out.println("This is Valid Triangle");
        }
        else {
            System.out.println("Invalid trangle");
        }
    }
}
