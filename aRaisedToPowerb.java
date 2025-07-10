import java.util.Scanner;

public class aRaisedToPowerb {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter value of a");
        int a=Sc.nextInt();
        System.out.println("Enter Value of b");
        int b=Sc.nextInt();
        int ans=1;
        for(int i=1;i<=b;i++){
            ans *=a;
        }
        System.out.println("a Raise to Power b = "+ans);
        Sc.close();

    }
}
