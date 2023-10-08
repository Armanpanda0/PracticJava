public class Str {

    public static void main(String[] args) {
        int a=123;
       String s=Integer.toString(a);
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        String s1=sb.toString();
        int k=Integer.parseInt(s1);
        System.out.println((s1));

        String str="Arman Panda";
        StringBuilder sbt=new StringBuilder(str);
        sbt.reverse();

       String s11= sbt.toString();
        System.out.println(s11);


    }
}
