import java.lang.StringBuilder;
public class Occurance {

    static String occurance(String input){

        if (input==null || input.isEmpty()){
            return input;
        }
        char currAns= input.charAt(0);
        StringBuilder compress=new StringBuilder();
        int count=0;
        for (int i=0;i<input.length();i++){
            if(input.charAt(i)==currAns){
                count++;
            }
            else {
                compress.append(currAns);
                compress.append(count);
                currAns=input.charAt(i);
                count=1;
            }
        }
        compress.append(currAns);
        compress.append(count);

       // if(compress.length()>input.length()){
        //    return input;
       // }else
            return compress.toString();
    }

    public static void main(String[] args) {
        String str="hellow";
        System.out.println(occurance(str)+" ");
    }
}
