public class OrderingOneTwoZero {
    static void display(int[] arr){
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
    static void swap(int[] arr,int m,int n){
        int temp=arr[m];
        arr[m]=arr[n];
        arr[n]=temp;
    }
    static void findvalue(int[] arr){
        int low=0,mid=0,hi=arr.length-1;
        //Ordering the 1's,2's,0's in their spacific conditional situation
        for(int i=0;i<arr.length;i++){
            if (arr[mid]==0){
                swap(arr,mid,low);
                low++;
                mid++;
            } else if (arr[mid]==1) {
                mid++;
            }
            else{
                swap(arr,mid,hi);
                hi--;
            }
        }
    }



    public static void main(String[] args) {
        int[] arr={2,2,1,1,0,0,0,1,2,1,1};
        findvalue(arr);
        display(arr);

    }
}
