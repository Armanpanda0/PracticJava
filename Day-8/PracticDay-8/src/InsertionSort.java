public class InsertionSort {
    static void insertion(int[] arr){
        int n=arr.length;
        for (int i=1;i<n;i++){
            int j=i;
            while (j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={5,6,3,2,7,1};
        insertion(arr);
        for (int a:arr){
            System.out.print(a+" ");
        }
    }
}
