package Array;

import java.util.Scanner;

public class RotateIn {
    public static void reverse(int[] arr,int x,int y){
        while(x<y){
            int temp=arr[x];
            arr[x]=arr[y];
            arr[y]=temp;
            x++;
            y--;
        }
    }

    public static void rotateInPlace(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }
     public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Number of elements");
        int n = Sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < n; i++) {
            arr[i] = Sc.nextInt();
        }
        System.out.println("Enter how many rotate you want to make :");
        int k = Sc.nextInt();
        System.out.println("Before Rotation ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        rotateInPlace(arr, k);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        Sc.close();
    }
}
