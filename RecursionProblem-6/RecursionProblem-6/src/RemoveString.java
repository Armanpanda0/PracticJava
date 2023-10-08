import java.sql.SQLOutput;
import java.util.Scanner;

public class RemoveString {

    static void removeString3(String str){
       StringBuilder st=new StringBuilder(str);
       str.chars().distinct().forEach(c ->st.append((char)c));
        System.out.println(st);
    }
    static void removeString2(String str){
        String stp=str.replaceAll("[aA]","B");
        System.out.println(stp);
    }
    static void removeString1(String str){
        String stp=str.replaceAll("\\s","");
        System.out.println(stp);
    }

    static  void removeString(String str){
        String ste=str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(ste);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        removeString3(str);
    }
}
