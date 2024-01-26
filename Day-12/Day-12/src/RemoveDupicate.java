import java.util.ArrayList;

public class RemoveDupicate {

    public static void main(String[] args) {
        int nums[]={0,0,1,1,1,2,2,3,3,4};
        int n=nums.length;
        int p=1;
        //int ar[]=new int[p];
        //ArrayList<Integer> arr=new ArrayList<Integer>();
        //int k=;
        //int count=0;
        for (int i=1;i<n;i++){
           if(nums[i]!=nums[i-1]){
               nums[p++]=nums[i];
           }
        }
        System.out.print(p+" ");
        System.out.print("\n");

       // System.out.println(ar);
        for (int val:nums){
            System.out.print(val+" ");
        }
    }
}
