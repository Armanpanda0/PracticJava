public class Main {
    static int RomToInt(String s){
        int n=s.length();
        int ans=0,num=0;
        for(int i=n-1;i>=0;i--){
            switch(s.charAt(i)){
                case 'I':
                    num=1;
                    break;
                case 'V':
                    num=5;
                    break;
                case 'X':
                    num=10;
                    break;
                case 'L':
                    num=50;
                    break;
                case 'C':
                    num=100;
                    break;
                case 'D':
                    num=500;
                    break;
                case 'M':
                    num=1000;
                    break;
            }
        }
        if(4*num < ans)ans-=num;
        else ans+=num
                ;
        return ans;
    }/*
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
*/

    public static void main(String[] args) {
        System.out.println("Roman to Integer: ");
        String s="MI";
        int n=RomToInt(s);
        System.out.println(n);

    }
}