import java.util.Scanner;

public class AreaNPeriOfCircle {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            double r=sc.nextInt();
            double pi=3.141;
            double area=pi*r*r;
            double peri=2*pi*r;
            System.out.println("Area is "+area);
            System.out.println("Perimeter is "+peri);
        }
}
