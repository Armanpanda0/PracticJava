import java.util.Scanner;

public class SpecifyCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if (Character.isLowerCase(ch)){
            System.out.println("This is character");
        }else if(Character.isDigit(ch)){
            System.out.println("This is Digit");
        }else {
            System.out.println("This is Special character: ");
        }
    }
}
