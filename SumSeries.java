import java.util.Scanner;

public class SumSeries {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter terms");
        int terms = Sc.nextInt();
        int sum = 0;
        for(int i=1;i<=terms;i++){
            if(i%2==0){
                sum-=i;
            }else{
                sum+=i;
            }
        }
        System.out.println("Sum of Series = "+sum);
        Sc.close();
    }
}
