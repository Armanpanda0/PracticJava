public class Main {
    static int findMinimum(int[] arr ){
        int n=arr.length;
        int low=0;
        int ans=-1;
        int high=n-1;
        while(low<=high){
           int mid=low+(high-low)/2;
            if (arr[mid]<=arr[high]){
                ans=mid;
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return ans;
    }
    //Finding the index of the minimum element;
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] arr={2,3,4,5,1};
        System.out.println("Index is "+findMinimum(arr));

    }
}