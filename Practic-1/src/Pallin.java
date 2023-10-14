public class Pallin {
    public static void main(String[] args) {
        String str="MadaM";
        String re=str;
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        System.out.println("StringBuilder is "+sb);
        String t=sb.toString();
        System.out.println("String is "+t);
        if(t.equals(re)){
            System.out.println("true");
        }else
            System.out.println("False");
    }
}
