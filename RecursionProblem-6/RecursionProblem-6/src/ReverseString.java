import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
//Approaforch-1
        char[] ch=str.toCharArray();
        System.out.print(ch);
        System.out.println();
        for(int i=ch.length-1;i>=0;i--){
            System.out.print(ch[i]);
        }
        System.out.println();
        //Approach -2
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        //Approach 3
        System.out.println();
        System.out.println("This is Buffer");
        StringBuffer sb=new StringBuffer(str);
        System.out.println(sb.reverse());
        //Approach 4
        System.out.println();
        System.out.println("This is StringBuilder");
        StringBuilder stb=new StringBuilder(str);
        System.out.println(stb.reverse());

    }
}
