public class ReverseStr {
    public static void main(String[] args) {
        String str="Arman";
        System.out.println(str);
        char[] ch=str.toCharArray();

        for (int i=0;i<ch.length;i++){

            for (int j=0;j<ch.length;j++){
                if (ch[i]<ch[j]){
                    char temp=ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;
                }
            }

        }
        System.out.println(new String(ch));

    }
}
