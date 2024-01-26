import java.util.Arrays;

public class BinarySearch {
    static void BinarySeearch(int[] arr,int tag){
        int low=0;
        int high=arr.length-1;
        int count=0;
        while (low<high){
            int mid=low+(high-low)/2;
            if (arr[mid]==tag){
                count++;
            }else if(arr[mid]<tag){
                low=mid+1;
            }else {
                high=mid-1;
            }
        }
        //return -1;
        if (count==0){
            System.out.println("No");
        }else {
            System.out.println("Yes");
        }

    }
    public static void main(String[] args) {
        int[] arr={33,4,5,1,7,8};
        int tag=4;
        Arrays.sort(arr);
        System.out.println(tag);
        BinarySeearch(arr,tag);
      //  if (ans==-1){
       //     System.out.println("Not Present");
        //}else {
          //  System.out.println(" Present");
        //}
        for (int val:arr){
            System.out.print(val+" ");
        }
    }
}
