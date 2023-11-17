import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 digit numbernumber: ");
        int n = sc.nextInt();
        if (n / 1000 == 0) {
            int ans = n / 100;
            System.out.println(ans);
        }else {
            System.out.println("This is not a 3 digit number");
        }
    }
}
