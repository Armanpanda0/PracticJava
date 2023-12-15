import java.util.Scanner;
import java.util.ArrayList;

public class subsiQ {

    static ArrayList<String> SSQ(String s){
        ArrayList<String> ans=new ArrayList<>();
        //Self work
        if(s.length()==0){
            ans.add("");
            return ans;
        }
        //Recurssive work
        char ch=s.charAt(0);//a
        ArrayList<String> smallans=SSQ(s.substring(1));//Deleting the 0th index

//Base case
        for (String ss:smallans){
            ans.add(ss);
            ans.add(ch+ss);
        }



        return ans;
    }
    public static void main(String[] args) {
       // Scanner sc=new Scanner(System.in);
        //String str=sc.nextLine();
       // System.out.println(SSQ(str));
        ArrayList<String> st=SSQ("abcd");
        for (String ss:st){
            System.out.println(ss);
        }
    }
}
