import java.util.Scanner;

public class Main {

     static String compresstring(String input){
        if (input==null || input.isEmpty()){
            return input;
        }
        StringBuilder compress=new StringBuilder();
        char currentChar=input.charAt(0);
        int count=0;
        for (int i=0;i<input.length();i++){
            if (input.charAt(i)==currentChar){
                count++;
            }
            else {
                compress.append(currentChar);
                compress.append(count);
                currentChar=input.charAt(i);
                count=1;
            }

        }
         compress.append(currentChar);
         compress.append(count);
         if (compress.length() > input.length()){
             return input;
         }
         else
             return compress.toString();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(compresstring(str));
    }
}