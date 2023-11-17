import java.util.Scanner;

public class VolNPeriOfCyl {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Radious: ");
            double r=sc.nextInt();
            System.out.println("Height");
            double h=sc.nextDouble();
            double pi=3.141;
            double vol=2*pi*r*r*h;
            double peri=(2*pi*r*h*r)+(2*pi*r*h);
            System.out.println("Volume of Cylinder is "+vol);
            System.out.println("Perimetr of Cylinder is: "+peri);
        }
}
