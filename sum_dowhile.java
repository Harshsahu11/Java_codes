import java.util.Scanner;

public class sum_dowhile {
        public static void main(String[] args) {
            Scanner Sc=new Scanner(System.in);
            System.out.println("Enter a number");
            int n=Sc.nextInt();
            int i=1;
            int sum=0;
            do{
                sum+=i;
                i++;
            }while(i<=n);
            System.out.println("Sum = "+sum);
        }    
}
