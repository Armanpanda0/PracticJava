import java.io.*;
public class Main {
    public static void main(String[] args) {
        String str;
       Console obj=System.console();
        System.out.print("Enter Your name: ");
         str=obj.readLine();
        System.out.print("Password is: ");
        char[] ch=obj.readPassword();
        System.out.println("IS "+str);
        System.out.println("is "+ch);
    }
}