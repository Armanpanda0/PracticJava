public class BinarySearch {
    static boolean binarysearch(int[] arr,int st,int end,int tag){
        if(st>end) return false;
        int mid=st+(end-st)/2;
        if (tag==arr[mid]) return true;
        else if(tag>arr[mid]) return binarysearch(arr,mid+1,end,tag);
        else return binarysearch(arr,st,mid-1,tag);

    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int tag=6;
        binarysearch(arr,0,arr.length-1,tag);
     //   while(tag!=10) {
            System.out.printf("%b", binarysearch(arr, 0, arr.length - 1, tag));
        //}
    }
}
