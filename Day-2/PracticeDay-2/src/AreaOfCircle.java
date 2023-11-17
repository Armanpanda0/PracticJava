import java.util.Scanner;

public class AreaOfCircle {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Height: ");
            double r=sc.nextInt();
            System.out.println("Base: ");
            double pi=sc.nextInt();
            double area=.5*pi*r;
            System.out.println("Area of Triangle "+area);
        }
}
