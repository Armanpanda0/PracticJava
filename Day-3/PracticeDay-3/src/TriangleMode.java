import java.util.Scanner;

public class TriangleMode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 3 sides of the Triangle: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a==b&&b==c&&a==c){
            System.out.println("Triangle is Equilateral.");
        }else if(a==b || b==c || a==c){
            System.out.println("Triangle is Isoscale.");
        }else {
            System.out.println("Scalene");
        }
    }
}
