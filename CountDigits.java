import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=Sc.nextInt();
        int count = 0;
        while(n>0){
            count++;
            n=n/10;
        }
        System.out.println("Number of Digits = "+count);
        Sc.close();
    }   
}
