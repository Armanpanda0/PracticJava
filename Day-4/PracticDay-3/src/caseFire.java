import java.util.Scanner;

public class caseFire {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if (Character.isLowerCase(ch)){
            System.out.println("LowerCase");
        }else {
            System.out.println("UpperCase");
        }
    }
}
