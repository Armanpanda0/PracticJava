public class Main {
    static int squareRoot(int x){
        if(x==0 || x==1) return x;
        int low=0,mid=-1,high=x;
        int con=mid;
        while(low<=high){
            mid=low+(high-low)/2;
            if ((long)mid*mid==(long)x)
                return mid;
            else if((long)mid*mid>x)
                high=mid-1;
            else
                low=mid+1;
        }
        return Math.round(con);
    }

    public static void main(String[] args) {
        System.out.println("Enter the Number: ");
        int n=21;
        int p=squareRoot(n);
        System.out.println(p);
    }
}