import java.util.Scanner;

public class LexBubble {

    static void BubbleLex(String[] st){
        int m=st.length;
        for (int i=0;i<m-1;i++){
            boolean flag=false;
            for (int j=i;j<m-i-1;j++){
                if ((st[j].compareTo(st[j+1])>0)){
                    String temp=st[j];
                    st[j]=st[j+1];
                    st[j+1]=temp;
                    flag=true;
                }
            }
            if (!flag){
                return;
            }
        }
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("String Size: ");
       int n=sc.nextInt();
        String[] str=new String[n];
        for (int i=0;i<str.length;i++){
            str[i]=sc.nextLine();
        }
       // String[] str={"coding","is","fun"};
        BubbleLex(str);
        for (String val:str){
            System.out.print(val+" ");
        }
    }
}
