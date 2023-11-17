import java.util.Scanner;

public class AreaOfSquare {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the side of the Square: ");
            double r = sc.nextInt();
            double area = r * r;
            System.out.println("Area of Square is:  " + area);
        }

}

