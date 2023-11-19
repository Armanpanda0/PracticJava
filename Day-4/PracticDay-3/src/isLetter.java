import java.util.Scanner;

public class isLetter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if (Character.isLetter(ch)){
            System.out.println("This is a character");
        }else {
            System.out.println("This is Not a Character");
        }
    }
}
