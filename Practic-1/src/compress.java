public class compress {
   static String mei(String input){
       //String input="aabbcccc";
       if(input == null || input.isEmpty()){
           return input;
       }
       StringBuilder sb=new StringBuilder();
       char ch=input.charAt(0);
       int count=1;
       for (int i=1;i<input.length();i++){
           if(input.charAt(i)==ch){
               count++;
           }
           else {
               sb.append(ch);
               sb.append(count);
               ch=input.charAt(i);
               count=1;
           }
       }
       sb.append(ch);
       sb.append(count);
       if(sb.length()>=input.length()){
           return input;
       }else
           return sb.toString();
   }
    public static void main(String[] args) {
        String str="aabbcccc";
        System.out.println(mei(str));
    }
}
