public class Main {

    static void selectionSort(int[] arr){
        int n=arr.length;

        for (int i=0;i<n-1;i++){
            int min=i;
            for (int j=i+1;j<n;j++){
                if (arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }


    public static void main(String[] args) {
        int arr[]={5,4,2,6,7,1};
        selectionSort(arr);
        for (int a:arr){
            System.out.print(a+" ");
        }
    }
}