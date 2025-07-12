package Array;
public class swap {
    public static void swapping(int a,int b){
        System.out.println("Values before Swapping : "+a+" "+b);
        // int temp=a;   using temp variable
        // a=b;
        // b=temp;

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Values before Swapping : "+a+" "+b);
    }
    public static void main(String[] args) {
        int a=10;
        int b=20;
        swapping(a,b);
    }
}
