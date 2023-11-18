import java.util.Scanner;

public class TriangleAngle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the angle of the triangle: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a+b+c==180){
            System.out.println("valid Triangle");
        }else {
            System.out.println("Invalid Triangle");
        }
    }
}
