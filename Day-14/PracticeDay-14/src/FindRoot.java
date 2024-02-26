public class FindRoot {
    static int findroot(int x){
        int mid=-1,ans=mid;
        int low=0;
        int high=x;
        while(low<high){
            mid=low+(high-low)/2;
            if (mid*mid==x){
                ans=mid;
                high=mid-1;
            }else if (mid*mid>x){
                high=mid-1;
            }else
                low=mid+1;
        }
        return Math.round(ans);
    }

    public static void main(String[] args) {
        int x=25;
        System.out.println(findroot(x));
    }
}
