public class linearSearch {
    static void leanerSearch(int[] arr,int tag){
        int con=0;
        for (int i=0;i<arr.length-1;i++){
            if (arr[i]==tag){
                con++;
            }
        }
        if (con==0){
            System.out.println("Not present ");
        }else {
            System.out.println("Present ");
        }
    }


    public static void main(String[] args) {
       int[] arr={22,4,5,1,66,9};
       int n=arr.length;
       int tag=5;
        System.out.println(tag);
       leanerSearch(arr,tag);
       for (int val:arr){
           System.out.print(val+" ");
       }
    }
}
