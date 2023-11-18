import java.util.Scanner;

public class MonthWeek {
    public static void main(String[] args) {
        System.out.println("Enter the week number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        switch (n){
            case 3:
                System.out.println("feb");
                break;
            case 4:
                System.out.println("Apr,july,sept,Nov");
                break;
            case 5:
                System.out.println("Jan,March,May,July,Aug,Oct,Dec");
                break;
            default:
                System.out.println("Please input only 3,4,5: Ok??!!");
        }
    }
}
