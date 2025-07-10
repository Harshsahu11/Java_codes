import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=Sc.nextInt();
        int Sum = 0;
        while(n>0){
            int d=n%10;
            Sum+=d;
            n=n/10;
        }
        System.out.println("Sum of Digits = "+Sum);
        Sc.close();
}
}