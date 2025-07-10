import java.util.Scanner;
public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Principle Amount");
        float P=Sc.nextFloat();
        System.out.println("Enter Rate of Intrest");
        float R=Sc.nextFloat();
        System.out.println("Enter Time ");
        float T=Sc.nextFloat();

        float SI= (P*R*T)/100;
        System.out.println("Simple Intrest : "+SI);
        Sc.close();
    }
    
}
