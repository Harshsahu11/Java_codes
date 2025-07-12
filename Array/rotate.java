package Array;

import java.util.Scanner;

public class rotate {

    public static int[] rotateArray(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        int ans[] = new int[n];
        int j=0;
        for(int i=n-k;i<n;i++){
            ans[j++]=arr[i];
        }
        for(int i=0;i<n-k;i++){
            ans[j++]=arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Number of elements");
        int n=Sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i=0;i<n;i++){
            arr[i]=Sc.nextInt();
        }
        System.out.println("Enter how many rotate you want to make :");
        int k=Sc.nextInt();
        System.out.println("Before Rotation ");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        int[] ans = rotateArray(arr, k);
        for(int i:ans){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}