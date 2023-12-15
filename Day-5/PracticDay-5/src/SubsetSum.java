public class SubsetSum {

    static void sunsetSum(int[] a,int n,int idx,int sum){
    if(idx>=n){
        System.out.print(sum+" ");
        return;
    }
    sunsetSum(a,n,idx+1,sum+a[idx]);
    sunsetSum(a,n,idx+1,sum);



    }

    public static void main(String[] args) {
        int[] arr={2,3,4};
        sunsetSum(arr,arr.length,0,0);
    }
}
