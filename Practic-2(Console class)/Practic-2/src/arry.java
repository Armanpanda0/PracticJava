public class arry {
    public static void main(String[] args) {
        int arr[]={3,2,4,11};
        int max=arr[0];
        for (int i=1;i<arr.length;i++){
            if(max<arr[i]){
                int temp=arr[i];
                arr[i]=arr[max];
                arr[max]=temp;
            }
            System.out.print(arr[i]+" ");
        }

    }
}
