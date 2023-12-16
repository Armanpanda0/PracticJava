public class Main {
    //Forg jump...... Finding the minimum cost to reach to the end of the Array
    //Given an array,Size of Array,current Index.

    static int best(int[] h,int a,int idx){
        if (idx==a-1) return 0;
        int op1=Math.abs(h[idx]-h[idx+1])+best(h,a,idx+1);
        if (idx==a-2) return op1;
        int op2=Math.abs(h[idx]-h[idx+2])+best(h,a,idx+2);

        return Math.min(op1,op2);
    }

    public static void main(String[] args) {
        //System.out.println("Hello world!");
        int[] arr={10,20,30,40};
        System.out.println(best(arr,4,0));
    }
}