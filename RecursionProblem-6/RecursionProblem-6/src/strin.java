import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class strin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
        String result ="";
        // int i = 0;
        int n = s.length()-1;
        while(n>=0){
            while(n>=0 && s.charAt(n)==' '){
                n--;
            }if (n<=0) break;
            int j=n;
            while(n>=0 && s.charAt(n)!=' '){
                n--;
            }
            if (s.isEmpty()){
                result=result.concat(s.substring(n+1,j+1));
            }else {
                result=result.concat(" "+s.substring(n+1,j+1));
            }


        }
        System.out.println(result);




    }

}
