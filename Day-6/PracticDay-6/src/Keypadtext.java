public class Keypadtext {
    static void best(String s,String[] kp,String res){
        if (s.length()==0){
            System.out.print(res+" ");
            return;
        }
        int currNum=s.charAt(0)-'0';//a exclude
        String currentChoice=kp[currNum];//"abc"
        for (int i=0;i<currentChoice.length();i++){
            best(s.substring(1),kp,res+currentChoice.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str="235";
        String[] kp={"" , "" , "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        best(str,kp,"");
    }
}
