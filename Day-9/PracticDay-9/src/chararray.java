import java.lang.String;
public class chararray {

    static void chracterarray(String st){
        char[] ch=st.toCharArray();
        int n=ch.length;
        for (int i=0;i<n;i++){
            for (int j=i;j<n-i-1;j++){
                if (ch[j]>ch[j+1]){
                    char temp=ch[j];
                    ch[j]=ch[j+1];
                    ch[j+1]=temp;
                  //  System.out.println(ch[j]);
                }
            }
            System.out.print(ch[i]);
        }
    }


    public static void main(String[] args) {
        String str="coding";
        chracterarray(str);
        //System.out.println(str);
    }
}
