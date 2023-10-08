import java.util.Scanner;

public class Main {

    static boolean searcharray(int[] a,int n,int target ,int idx){
        // Base case
            if(idx>=n){
                return false;
            }
        //Self work
        if(a[idx]==target) return true;
        // recursive work
        return searcharray(a,n,target,idx+1);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the array element: ");
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        System.out.println("The Array elements are: ");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("\nEnter the target element:  ");
        int target=sc.nextInt();
        if(searcharray(a,a.length,target,0)) {
            System.out.println("Yes");
        }else
            System.out.println("No");
    }
}