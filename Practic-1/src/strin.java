public class strin {
    public static void main(String[] args) {
        String s="Arman PAnda";
        StringBuilder sb=new StringBuilder("Arman Me");
        sb.append(" To you");
        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
        System.out.println(sb);
    }
}
