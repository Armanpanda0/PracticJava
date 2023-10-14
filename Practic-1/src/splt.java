import java.util.Scanner;

public class splt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] str1=str.split(" ");
       int count=0;
       if(str.charAt(0)!=' '){
           count++;
       }
       for(int i=0;i<str.length();i++){
           if(str.charAt(i)==' ' && str.charAt(i+1)!=' '){
               count++;
           }
       }
        System.out.println(count);
        for(String st:str1)  {
            System.out.println(st);
        }

    }
}
