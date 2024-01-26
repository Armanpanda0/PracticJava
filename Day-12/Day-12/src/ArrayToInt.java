public class ArrayToInt {
    public static void main(String[] args) {
        int arr[]={8,9};
        int ans=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            ans=ans*10+arr[i];
            count++;
        }
        //System.out.println(count);
        System.out.println(ans);
        int me=ans+1;
        int you=me;
        int k=count-1;
        int[] arr1=new int[count];
        while(you!=0){
            int rem=you%10;
            arr1[k--]=rem;
            you/=10;

        }
        for (int val:arr1){
            System.out.print(val+" ");
        }
    }
}
