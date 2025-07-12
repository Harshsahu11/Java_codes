package Array;

public class reverseArray {
    static int[] reverse(int[] arr){
        int n=arr.length;
        int ans[] =new int[n];
        int j=0;
        for(int i=n-1;i>=0;i--){
            ans[j++]=arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={2,4,35,5,35,3};
        int[] ans =reverse(arr);
        for(int a:ans){
            System.out.println(a);
        }
    }
}
