import java.util.Arrays;
public class Amagran {
    public static void main(String[] args) {
        String s1="Arman";
        String s2="Amrna";
        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2)){
            System.out.println("Yes it is Anagram");
        }else
            System.out.println("No it is not");

    }
}
