public class ElementAppearingMore {
    static int findIt(int[] arr){
        int n=arr.length;
        int count=1;
        for(int i=1;i<n;i++){
        if(arr[i-1]==arr[i]){
            count++;
            System.out.println(arr[i]+" "+ count);
            break;
        }
        else count=1;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr={1,2,2,6,6,6,6,7,10};
        int n=findIt(arr);
        System.out.println(n+" ");
        //int[] a={2,3,4,2,1,9};
       // Arrays.sort(a)

    }
}
