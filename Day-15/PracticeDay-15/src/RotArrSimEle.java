public class RotArrSimEle {
    static int searchEle(int[] arr,int target){
        int low=0;int high=arr.length-1;
        // int ans=-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[low]==arr[mid] && arr[high]==mid){
                low++;
                high--;
            }
            else if(arr[mid]<=arr[high]){
                //This is Sorted array
                if(target>arr[mid] && target<=arr[high]){
                    low=mid+1;
                }else {
                    high=mid-1;
                }
            }else{
                if (target<arr[mid]&& target>=arr[low]){
                    high=mid-1;
                }else {
                    low=mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,0};
        int tag=2;
        System.out.println(searchEle(arr,tag));
    }
}
