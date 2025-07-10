import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = Sc.nextInt();
        int rev=0;
        int n=num;
        while(n>0){
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        System.out.println("Reverse of "+num +" is : "+rev);
        Sc.close();
    }
}
