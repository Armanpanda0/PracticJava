import java.util.Arrays;
import java.util.Scanner;
public class panagran {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
       str= str.replace(" ","");
        char[] ch=str.toCharArray();
        int size=ch.length;
        int a[]=new int[97];
        //int a[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int i=0;
        while(i!=size){
            int index=ch[i]-65;
            a[index]=1;
            ++i;
           // System.out.print(a[index]+" ");
        }
        i=0;
        while(i>=26){
            if(a[i]==1){
                ++i;
               // System.out.println("Pana");
            }else {
                System.out.println("Not panagram");
                System.exit(0);
            }
        }
        System.out.println("Panagrams ");

    }
}
