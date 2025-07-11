package Array;

import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Number of elements");
        int n=Sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter value for element "+(i+1));
            arr[i]=Sc.nextInt();
        }
        System.out.println("Enter element you want to search");
        int key = Sc.nextInt();

        int found=0;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                found=i;
                break;
            }
        }
        if(found>0){
            System.out.println("Element Found at index : "+found);

        }else{
            System.out.println("Element found at index : "+(-1));
        }
    }
}
