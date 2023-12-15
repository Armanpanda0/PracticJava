public class printSSQ {

    static void subciQ(String s,String currAns){


        char ch=s.charAt(0);//a
        String smallAns=s.substring(1);
         if (s.length()==1){
             System.out.println(currAns);
             return;
         }
         subciQ(smallAns,ch+currAns);
         subciQ(smallAns,currAns);
    }


    public static void main(String[] args) {
        //String str="abcd";
        subciQ("abc","");

    }
}
