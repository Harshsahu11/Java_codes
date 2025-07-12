package Array;

public class reverse {
    public static void reversearr(int[] arr){
        int n=arr.length-1;
        int mid=n/2;
        for(int i=0;i<=mid;i++){
            int temp=arr[i];
            arr[i]=arr[n];
            arr[n]=temp;
            n--;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        System.out.println("Original");
        for(int i:arr){
            System.out.println(i);
        }

        reversearr(arr);
        System.out.println("Reversed");
        for(int i:arr){
            System.out.println(i);
        }
    }
}
