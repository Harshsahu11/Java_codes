import java.util.Scanner;

public class PrintFactorial {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Terms");
        int terms = Sc.nextInt();
        int fact=1;
        for(int i=1;i<=terms;i++){
            fact = fact*i;
        }
        System.out.println("Factorial = "+fact);
        Sc.close();
    }
}
