package Array;
class targetsum{

    public static int pairs(int[] arr,int target){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,4,5,8,7,9,3};
        int target=14;

        int ans = pairs(arr,target);
        System.out.println("Target Sum : "+ans);
    }
}